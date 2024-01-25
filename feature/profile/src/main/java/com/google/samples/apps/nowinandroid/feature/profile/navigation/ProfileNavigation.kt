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

package com.google.samples.apps.nowinandroid.feature.profile.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.google.samples.apps.nowinandroid.feature.profile.ProfileRoute
import com.google.samples.apps.nowinandroid.feature.profile.ProfileScreen

private const val PROFILE_GRAPH_ROUTE_PATTERN = "profile_graph"
const val PROFILE_ROUTE = "profile_route"

fun NavGraphBuilder.profileGraph(
    onProfileActionClick: (String) -> Unit,
    nestedGraphs: NavGraphBuilder.() -> Unit,
) {
    navigation(
        route = PROFILE_GRAPH_ROUTE_PATTERN,
        startDestination = PROFILE_ROUTE,
    ) {
        composable(route = PROFILE_ROUTE) {
            ProfileScreen(
                onTopicClick = onTopicClick,
            )
        }
        nestedGraphs()
    }
}