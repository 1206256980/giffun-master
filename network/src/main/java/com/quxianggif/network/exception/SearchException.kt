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

package com.quxianggif.network.exception

/**
 * 搜索请求时出现的异常，使用此异常类进行抛出。
 *
 * @author guolin
 * @since 18/7/25
 */
class SearchException(message: String) : RuntimeException(message) {

    companion object {
        const val KEYWORD_IS_BLANK = "Search keyword could not be blank."
    }

}
