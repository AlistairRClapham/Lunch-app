package service

import java.util.Calendar

import com.google.inject.ImplementedBy

class GreetingService extends  {
  def greeting: String = {
    val now = Calendar.getInstance()
    val currentHour = now.get(Calendar.HOUR_OF_DAY)
    if (currentHour < 12)
      "Good morning!"
    else
      "Good afternoon!"
  }
}
