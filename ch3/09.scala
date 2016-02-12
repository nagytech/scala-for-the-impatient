import java.util.TimeZone._

getAvailableIDs.filter(_.startsWith("America/")).map(_.substring(8)).sorted