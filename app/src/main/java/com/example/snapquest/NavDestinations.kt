package com.example.snapquest

import kotlinx.serialization.Serializable

@Serializable
data object QuestListRoute

@Serializable
data class QuestDetailRoute(val id: Int)
