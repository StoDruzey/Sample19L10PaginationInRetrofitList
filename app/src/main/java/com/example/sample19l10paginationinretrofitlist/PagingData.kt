package com.example.sample19l10paginationinretrofitlist

sealed class PagingData<out T> {
    data class Item<T>(val data: T) : PagingData<T>()
    object Loading : PagingData<Nothing>()
}