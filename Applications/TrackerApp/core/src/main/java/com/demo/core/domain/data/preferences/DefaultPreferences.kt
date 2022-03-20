package com.demo.core.domain.data.preferences

import android.content.SharedPreferences
import com.demo.core.domain.model.ActivityLevel
import com.demo.core.domain.model.Gender
import com.demo.core.domain.model.GoalType
import com.demo.core.domain.model.UserInfo
import com.demo.core.domain.preferences.Preferences

/**
 * This is the implementation of Preferences interface
 * This helps to keep dependency inversion principle
 * *******
 * Tomorrow if we want to change the implementation to a different implementation, we can have it
 * We don't inject teh implementation but inject the interface used here wherever needed
 * Also it helps to create a fake version of this to achieve the test implementations for testing
 */
class DefaultPreferences(
    private val sharedPref: SharedPreferences
) : Preferences {

    override fun saveGender(gender: Gender) {
        sharedPref.edit()
            .putString(Preferences.KEY_GENDER,gender.name).apply()
    }

    override fun saveAge(age: Int) {
        sharedPref.edit()
            .putInt(Preferences.KEY_AGE,age).apply()
    }

    override fun saveWeight(weight: Float) {
        sharedPref.edit()
            .putFloat(Preferences.KEY_WEIGHT,weight).apply()
    }

    override fun saveHeight(height: Int) {
        sharedPref.edit()
            .putInt(Preferences.KEY_HEIGHT,height).apply()
    }

    override fun saveActivityLevel(level: ActivityLevel) {
        sharedPref.edit()
            .putString(Preferences.KEY_ACTIVITY_LEVEL,level.name).apply()
    }

    override fun saveCarbRatio(ratio: Float) {
        sharedPref.edit()
            .putFloat(Preferences.KEY_CARB_RATIO,ratio).apply()
    }

    override fun saveProteinRatio(ratio: Float) {
        sharedPref.edit()
            .putFloat(Preferences.KEY_PROTEIN_RATIO,ratio).apply()
    }

    override fun saveFatRatio(ratio: Float) {
        sharedPref.edit()
            .putFloat(Preferences.KEY_FAT_RATIO,ratio).apply()
    }

    override fun loadUserInfo(): UserInfo {
        val age = sharedPref.getInt(Preferences.KEY_AGE, -1)
        val height = sharedPref.getInt(Preferences.KEY_HEIGHT, -1)
        val weight = sharedPref.getFloat(Preferences.KEY_WEIGHT, -1f)
        val genderString = sharedPref.getString(Preferences.KEY_GENDER, null)
        val activityLevelString = sharedPref
            .getString(Preferences.KEY_ACTIVITY_LEVEL, null)
        val goalType = sharedPref.getString(Preferences.KEY_GOAL_TYPE, null)
        val carbRatio = sharedPref.getFloat(Preferences.KEY_CARB_RATIO, -1f)
        val proteinRatio = sharedPref.getFloat(Preferences.KEY_PROTEIN_RATIO, -1f)
        val fatRatio = sharedPref.getFloat(Preferences.KEY_FAT_RATIO, -1f)

        return UserInfo(
            gender = Gender.fromString(genderString ?: "male"),
            age = age,
            weight = weight,
            height = height,
            activityLevel = ActivityLevel.fromString(activityLevelString ?: "medium"),
            goalType = GoalType.fromString(goalType ?: "keep_weight"),
            carbRatio = carbRatio,
            proteinRatio = proteinRatio,
            fatRatio = fatRatio
        )
    }

}