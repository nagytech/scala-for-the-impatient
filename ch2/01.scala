// Signum returns 1, 0 or -1 based on the following
// assessment of the num parameter

// if num is greater than 0:  1
// if num is less than 0:    -1 
// if num equals 0:           0

def signum(num: Int) : Int = {
 if (num > 0)
   1
 else if (num < 0)
   -1
 else
   0
}
