/*
 * Copyright (C) guolin, Suzhou Quxiang Inc. Open source codes for study only.
 * Do not use for commercial purpose.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.quxianggif.network.model

import com.google.gson.annotations.SerializedName
import com.quxianggif.core.model.WorldFeed
import com.quxianggif.network.request.FetchWorldFeedsRequest

/**
 * 获取世界频道Feeds请求的实体类封装。
 *
 * @author guolin
 * @since 17/7/14
 */
class FetchWorldFeeds : Response() {

    @SerializedName("data")
    var feeds: List<WorldFeed> = ArrayList()

    companion object {

        fun getResponse(callback: Callback) {
            FetchWorldFeedsRequest()
                    .listen(callback)
        }

        fun getResponse(lastFeed: Long, callback: Callback) {
            FetchWorldFeedsRequest()
                    .lastFeed(lastFeed)
                    .listen(callback)
        }
    }

}