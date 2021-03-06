/*
 * Copyright (c) 2017.
 * Distributed under the GNU GPLv3 by David Whitman.
 * https://www.gnu.org/licenses/gpl-3.0.en.html
 *
 * This source code is made available to help others learn. Please don't clone my app.
 */

package com.thunderclouddev.persistence

import java.util.Collections.emptyMap

/**
 * Created by david on 4/2/17.
 */
class Links(values: Map<String, List<String>>) : HashMap<String, List<String>>(values) {
    companion object REL {
        val SELF = "SELF"
        val ICON = "ICON"
        val THUMBNAIL = "THUMBNAIL"
        val SCREENSHOT = "SCREENSHOT"
        val CONTENT_RATING = "CONTENT_RATING"
    }

    constructor() : this(emptyMap())
}