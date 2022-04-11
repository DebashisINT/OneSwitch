package com.oneswitch.features.weather.api

import com.oneswitch.base.BaseResponse
import com.oneswitch.features.task.api.TaskApi
import com.oneswitch.features.task.model.AddTaskInputModel
import com.oneswitch.features.weather.model.ForeCastAPIResponse
import com.oneswitch.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}