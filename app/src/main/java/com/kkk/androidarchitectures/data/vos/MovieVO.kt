package com.kkk.androidarchitectures.data.vos

import com.google.gson.annotations.SerializedName

class MovieVO {
    @SerializedName("id")
    var id: String? = null
    @SerializedName("title")
    var title: String? = null
    @SerializedName("brief")
    var brief: String? = null
    @SerializedName("image_url")
    var imageUrl: String? = null
}