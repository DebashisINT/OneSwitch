package com.oneswitch.features.weather.api

import com.oneswitch.features.task.api.TaskApi
import com.oneswitch.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}