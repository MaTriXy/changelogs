/*
 * Copyright (c) 2017.
 * Distributed under the GNU GPLv3 by David Whitman.
 * https://www.gnu.org/licenses/gpl-3.0.en.html
 *
 * This source code is made available to help others learn. Please don't clone my app.
 */

package com.thunderclouddev.changelogs


import android.content.Context
import android.content.res.Configuration
import android.os.Build
import fdfeProtos.AndroidBuildProto
import fdfeProtos.AndroidCheckinProto
import fdfeProtos.AndroidCheckinRequest
import fdfeProtos.DeviceConfigurationProto
import java.util.*

@Suppress("UsePropertyAccessSyntax")
class NativeDeviceInfo(private val context: Context, private val localeString: String) {
    fun generateAndroidCheckinRequest(): AndroidCheckinRequest {
        return AndroidCheckinRequest
                .newBuilder()
                .setId(0)
                .setCheckin(
                        AndroidCheckinProto.newBuilder()
                                .setBuild(buildProto)
                                .setLastCheckinMsec(0)
                                .setCellOperator("310260") // Getting this and the next two requires permission
                                .setSimOperator("310260")
                                .setRoaming("mobile-notroaming")
                                .setUserNumber(0)
                )
                .setLocale(this.localeString)
                .setTimeZone(TimeZone.getDefault().id)
                .setVersion(3)
                .setDeviceConfiguration(deviceConfigurationProto)
                .setFragment(0)
                .build()
    }

    // Getting this and next list requires messing with ndk
    val deviceConfigurationProto: DeviceConfigurationProto
        get() {
            val builder = DeviceConfigurationProto.newBuilder()
            addDisplayMetrics(builder)
            addConfiguration(builder)
            return builder
                    .addAllNativePlatform(platforms)
                    .addAllSystemSharedLibrary(getSharedLibraries(context))
                    .addAllSystemAvailableFeature(getFeatures(context))
                    .addAllSystemSupportedLocale(locales)
                    .setGlEsVersion(196609)
                    .addAllGlExtension(Arrays.asList(*glExtensions))
                    .build()
        }

    private val buildProto: AndroidBuildProto
        get() = AndroidBuildProto.newBuilder()
                .setId(Build.FINGERPRINT)
                .setProduct(Build.HARDWARE)
                .setCarrier(Build.BRAND)
//                .setRadio(Build.RADIO)
                .setRadio(Build.getRadioVersion())
                .setBootloader(Build.BOOTLOADER)
                .setDevice(Build.DEVICE)
                .setSdkVersion(Build.VERSION.SDK_INT)
                .setModel(Build.MODEL)
                .setManufacturer(Build.MANUFACTURER)
                .setBuildProduct(Build.PRODUCT)
                .setClient("android-google")
                .setOtaInstalled(false)
                .setTimestamp(System.currentTimeMillis() / 1000)
                .setGoogleServices(GOOGLE_SERVICES_VERSION_CODE)
                .build()

    private fun addDisplayMetrics(
            builder: DeviceConfigurationProto.Builder): DeviceConfigurationProto.Builder {
        val metrics = this.context.resources.displayMetrics
        builder
                .setScreenDensity((metrics.density * 160f).toInt())
                .setScreenWidth(metrics.widthPixels)
                .setScreenHeight(metrics.heightPixels)
        return builder
    }

    private fun addConfiguration(
            builder: DeviceConfigurationProto.Builder): DeviceConfigurationProto.Builder {
        val config = this.context.resources.configuration
        builder
                .setTouchScreen(config.touchscreen)
                .setKeyboard(config.keyboard)
                .setNavigation(config.navigation)
                .setScreenLayout(config.screenLayout and 15)
                .setHasHardKeyboard(config.keyboard == Configuration.KEYBOARD_QWERTY)
                .setHasFiveWayNavigation(config.navigation == Configuration.NAVIGATIONHIDDEN_YES)
        return builder
    }

    companion object {

        // Getting this requires a permission and google services to be installed
        private val GOOGLE_SERVICES_VERSION_CODE = 80711500
        private val glExtensions = arrayOf("GL_AMD_compressed_ATC_texture",
                "GL_AMD_performance_monitor", "GL_ANDROID_extension_pack_es31a",
                "GL_APPLE_texture_2D_limited_npot", "GL_ARB_vertex_buffer_object",
                "GL_ARM_shader_framebuffer_fetch_depth_stencil", "GL_EXT_YUV_target",
                "GL_EXT_blit_framebuffer_params", "GL_EXT_buffer_storage", "GL_EXT_color_buffer_float",
                "GL_EXT_color_buffer_half_float", "GL_EXT_copy_image", "GL_EXT_debug_label",
                "GL_EXT_debug_marker", "GL_EXT_discard_framebuffer", "GL_EXT_disjoint_timer_query",
                "GL_EXT_draw_buffers_indexed", "GL_EXT_geometry_shader", "GL_EXT_gpu_shader5",
                "GL_EXT_multisampled_render_to_texture", "GL_EXT_primitive_bounding_box",
                "GL_EXT_robustness", "GL_EXT_sRGB", "GL_EXT_sRGB_write_control",
                "GL_EXT_shader_framebuffer_fetch", "GL_EXT_shader_io_blocks",
                "GL_EXT_tessellation_shader", "GL_EXT_texture_border_clamp", "GL_EXT_texture_buffer",
                "GL_EXT_texture_cube_map_array", "GL_EXT_texture_filter_anisotropic",
                "GL_EXT_texture_format_BGRA8888", "GL_EXT_texture_norm16", "GL_EXT_texture_sRGB_R8",
                "GL_EXT_texture_sRGB_decode", "GL_EXT_texture_type_2_10_10_10_REV",
                "GL_KHR_blend_equation_advanced", "GL_KHR_blend_equation_advanced_coherent",
                "GL_KHR_debug", "GL_KHR_no_error", "GL_KHR_texture_compression_astc_hdr",
                "GL_KHR_texture_compression_astc_ldr", "GL_OES_EGL_image", "GL_OES_EGL_image_external",
                "GL_OES_EGL_sync", "GL_OES_blend_equation_separate", "GL_OES_blend_func_separate",
                "GL_OES_blend_subtract", "GL_OES_compressed_ETC1_RGB8_texture",
                "GL_OES_compressed_paletted_texture", "GL_OES_depth24", "GL_OES_depth_texture",
                "GL_OES_depth_texture_cube_map", "GL_OES_draw_texture", "GL_OES_element_index_uint",
                "GL_OES_framebuffer_object", "GL_OES_get_program_binary", "GL_OES_matrix_palette",
                "GL_OES_packed_depth_stencil", "GL_OES_point_size_array", "GL_OES_point_sprite",
                "GL_OES_read_format", "GL_OES_rgb8_rgba8", "GL_OES_sample_shading",
                "GL_OES_sample_variables", "GL_OES_shader_image_atomic",
                "GL_OES_shader_multisample_interpolation", "GL_OES_standard_derivatives",
                "GL_OES_stencil_wrap", "GL_OES_surfaceless_context", "GL_OES_texture_3D",
                "GL_OES_texture_compression_astc", "GL_OES_texture_cube_map",
                "GL_OES_texture_env_crossbar", "GL_OES_texture_float", "GL_OES_texture_float_linear",
                "GL_OES_texture_half_float", "GL_OES_texture_half_float_linear",
                "GL_OES_texture_mirrored_repeat", "GL_OES_texture_npot", "GL_OES_texture_stencil8",
                "GL_OES_texture_storage_multisample_2d_array", "GL_OES_vertex_array_object",
                "GL_OES_vertex_half_float", "GL_OVR_multiview", "GL_OVR_multiview2",
                "GL_OVR_multiview_multisampled_render_to_texture", "GL_QCOM_alpha_test",
                "GL_QCOM_extended_get", "GL_QCOM_tiled_rendering", "GL_EXT_multi_draw_arrays",
                "GL_EXT_shader_texture_lod", "GL_IMG_multisampled_render_to_texture",
                "GL_IMG_program_binary", "GL_IMG_read_format", "GL_IMG_shader_binary",
                "GL_IMG_texture_compression_pvrtc", "GL_IMG_texture_format_BGRA8888",
                "GL_IMG_texture_npot", "GL_IMG_vertex_array_object", "GL_OES_byte_coordinates",
                "GL_OES_extended_matrix_palette", "GL_OES_fixed_point",
                "GL_OES_fragment_precision_high", "GL_OES_mapbuffer", "GL_OES_matrix_get",
                "GL_OES_query_matrix", "GL_OES_required_internalformat", "GL_OES_single_precision",
                "GL_OES_stencil8")

        private val platforms: List<String>
            get() {
                var platforms: MutableList<String> = ArrayList()
                if (Build.VERSION.SDK_INT >= 21) {
                    platforms = Arrays.asList(*Build.SUPPORTED_ABIS)
                } else {
//                    if (null != Build.CPU_ABI && !Build.CPU_ABI.isEmpty()) {
//                        platforms.add(Build.CPU_ABI)
//                    }
//                    if (null != Build.CPU_ABI2 && !Build.CPU_ABI2.isEmpty()) {
//                        platforms.add(Build.CPU_ABI2)
//                    }
                }
                return platforms
            }

        private fun getFeatures(context: Context) = context.packageManager.systemAvailableFeatures
                .filter { it.name != null }
                .map { it.name }

        private val locales
            get() = Locale.getAvailableLocales()
                    .map { it.toString() }
                    .filter { it.length <= 5 }

        private fun getSharedLibraries(context: Context): List<String> {
            return Arrays.asList(*context.packageManager.systemSharedLibraryNames)
        }
    }
}
