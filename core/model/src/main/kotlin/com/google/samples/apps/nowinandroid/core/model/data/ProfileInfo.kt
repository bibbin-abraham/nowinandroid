/*
 * Copyright 2024 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.nowinandroid.core.model.data

data class ProfileInfo(
    val name: String = "Guest",
    val isLoggedIn: Boolean,
    val loggedInUser: LoggedInProfile? = null,
)

data class LoggedInProfile(
    val userId: String,
    val email: String,
    val imageUrl: String? = null,
    val displayName: String,
    val followedTopicsCount: Int,
    val completedTopicsCount: Int,
    val profileRank: ProfileRank,
)

enum class ProfileRank {
    BEGINNER,
    INTERMEDIATE,
    ADVANCED,
}