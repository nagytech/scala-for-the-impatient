class Time(private val hours: Int, private val minutes: Int) {
  if (hours > 23 || hours < 0)
      throw new Exception("Hours must be between 0 and 23")
  if (minutes > 59 || minutes < 0)
    throw new Exception("Minutes must be between 0 and 59")
  def before(other: Time): Boolean = {
    hours < other.hours || (hours == other.hours && minutes < other.minutes)
  }
}

new Time(0,0).before(new Time(0,1))
new Time(0,1).before(new Time(0,0))
new Time(1,0).before(new Time(0,1))
new Time(1,1).before(new Time(1,2))