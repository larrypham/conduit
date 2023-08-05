package com.position.apps.conduit.domain.model

data class Article(
    val author: Profile,
    val body: String,
    val createdAt: String,
    val description: String,
    val favorited: Boolean,
    val favoritesCount: Int,
    val slug: Int,
    val tagList: List<String>,
    val title: String,
    val updatedAt: String
)