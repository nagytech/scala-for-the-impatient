import java.util.TimeZone.getAvailableIDs

// Returns a list of time zones under the given prefix
def timeZoneFilter(prefix: String): Array[String] = {
  
  val withSlash = prefix + '/';

  getAvailableIDs
    .filter(_.startsWith(withSlash))
    .map(_.substring(withSlash.length))
    .sorted

}

timeZoneFilter("America")
timeZoneFilter("Europe")

