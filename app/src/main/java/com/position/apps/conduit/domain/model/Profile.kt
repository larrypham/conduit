package com.position.apps.conduit.domain.model

data class Profile(
    val bio: String?,
    val following: Boolean,
    val image: String,
    val username: String
)