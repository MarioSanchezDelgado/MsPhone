package com.projects.msphone.models

import kotlinx.serialization.Serializable

@Serializable
data class Email(var value: String, var type: Int, var label: String)