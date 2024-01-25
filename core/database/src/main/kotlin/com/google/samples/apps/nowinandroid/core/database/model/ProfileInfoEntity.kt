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

package com.google.samples.apps.nowinandroid.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.samples.apps.nowinandroid.core.model.data.LoggedInProfile
import com.google.samples.apps.nowinandroid.core.model.data.ProfileRank

/**
 * Defines a topic a user may follow.
 * It has a one to many relationship with [RecentSearchQueryEntity]
 */
@Entity(
    tableName = "profileInfo",
)
data class ProfileInfoEntity(
    @PrimaryKey
    val userId: String,
    val displayName: String,
    val email: String,
    @ColumnInfo(defaultValue = "")
    val imageUrl: String,
    @ColumnInfo(defaultValue = "0")
    val followedTopicsCount: Int,
    @ColumnInfo(defaultValue = "0")
    val completedTopicsCount: Int,
    @ColumnInfo(defaultValue = "BEGINNER")
    val profileRank: String,
)

fun ProfileInfoEntity.asProfileInfoModel() = LoggedInProfile(
    userId = userId,
    displayName = displayName,
    email = email,
    imageUrl = imageUrl,
    followedTopicsCount = followedTopicsCount,
    completedTopicsCount = completedTopicsCount,
    profileRank = ProfileRank.valueOf(profileRank),
)