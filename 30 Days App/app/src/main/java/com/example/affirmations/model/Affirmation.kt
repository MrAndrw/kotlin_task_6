package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @StringRes val stringResourceId1: Int,
    @DrawableRes val imageResourceId: Int

)
