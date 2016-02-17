// From 'Starting out with Java' Gaddis, Muganda: Ch11 - Inheritance

class GradedActivity {
  protected var _score = 0
  def score = _score
  def getGrade(): Char = {
    if (_score >= 90) 'A'
    else if (_score >= 80) 'B'
    else if (_score >= 70) 'C' 
    else if (_score >= 60) 'D'
    else 'F'
  }
}

class FinalExam(val questions: Int, val missed: Int) 
  extends GradedActivity {
    val pointsEach = 100 / questions 
    _score = 100 - (missed * pointsEach)
}

val exam = new FinalExam(10, 2)

println(exam.getGrade)
println(exam.score)
