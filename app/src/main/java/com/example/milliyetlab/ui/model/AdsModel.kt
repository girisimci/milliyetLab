package com.example.milliyetlab.ui.model

import com.google.android.gms.ads.AdSize

data class AdsModel(
    val adSize: AdSize,
    val adUnitId: String,
    override val itemViewType: Int
) : BaseNewsModel()