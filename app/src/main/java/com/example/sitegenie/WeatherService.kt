//package com.example.sitegenie
//
//import okhttp3.OkHttpClient
//import okhttp3.Request
//import okhttp3.Response
//import org.json.JSONObject
//
//class WeatherService {
//    private val API_KEY = "ba4bdd712a074a5792e194008230506" // Replace with your actual API key
//    private val API_URL = "https://api.weatherapi.com/v1/forecast.json?key=$API_KEY&q="
//
//    private val client = OkHttpClient()
//
//    fun getWeather(location: String): WeatherData? {
//        val request = Request.Builder()
//            .url("$API_URL$location&days=5")
//            .build()
//
//        val response: Response = client.newCall(request).execute()
//        val responseData = response.body?.string()
//
//        return parseWeatherData(responseData)
//    }
//
//    private fun parseWeatherData(responseData: String?): WeatherData? {
//        responseData?.let {
//            val jsonObject = JSONObject(responseData)
//            // Parse the JSON data and map it to your WeatherData class
//            // You can use Gson or other JSON parsing libraries for this
//            // Extract the required information and return an instance of WeatherData
//        }
//        return null
//    }
//}