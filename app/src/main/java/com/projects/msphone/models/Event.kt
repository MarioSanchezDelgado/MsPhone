package com.projects.msphone.models

import kotlinx.serialization.Serializable

@Serializable
data class Event(var value: String, var type: Int)