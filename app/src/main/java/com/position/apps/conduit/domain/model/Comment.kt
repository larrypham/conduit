package com.position.apps.conduit.domain.model

data class Comment(
    val id: Int,
    val author: Profile,
    val body: String,
    val updatedAt: String,
    val createdAt: String
)