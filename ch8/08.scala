class Person(val name: String) {
  override def toString = getClass.getName + "[name=" + name + "]"
}

class SecretAgent(codename: String) extends Person(codename) { 
  override val name = "secret" 
  // Don’t want to reveal name . . . 
  override val toString = "secret" 
  // . . . or class name
}

/* COMMENTS

  In the person class there is a single name field and a single getter.  
  The getter returns the value of the name field, which may or may be
  set in the constructor.

  In the SecretAgent class there is a single name field and single getter
  in addition to the field and getter in the superclass.
  
  The getter returns the value of the name field, which is set to 'secret'
  within the constructor.  This is an override of the Person class name
  field and getter.

*/


/* OUTPUT

$ javap -c -private Person.class

public class Person {
  private final java.lang.String name;

  public java.lang.String name();
    Code:
       0: aload_0
       1: getfield      #13                 // Field name:Ljava/lang/String;
       4: areturn

  public java.lang.String toString();
    Code:
       0: new           #18                 // class scala/collection/mutable/StringBuilder
       3: dup
       4: invokespecial #22                 // Method scala/collection/mutable/StringBuilder."<init>":()V
       7: aload_0
       8: invokevirtual #26                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      11: invokevirtual #31                 // Method java/lang/Class.getName:()Ljava/lang/String;
      14: invokevirtual #35                 // Method scala/collection/mutable/StringBuilder.append:(Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
      17: ldc           #37                 // String [name=
      19: invokevirtual #35                 // Method scala/collection/mutable/StringBuilder.append:(Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
      22: aload_0
      23: invokevirtual #39                 // Method name:()Ljava/lang/String;
      26: invokevirtual #35                 // Method scala/collection/mutable/StringBuilder.append:(Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
      29: ldc           #41                 // String ]
      31: invokevirtual #35                 // Method scala/collection/mutable/StringBuilder.append:(Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
      34: invokevirtual #43                 // Method scala/collection/mutable/StringBuilder.toString:()Ljava/lang/String;
      37: areturn

  public Person(java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #13                 // Field name:Ljava/lang/String;
       5: aload_0
       6: invokespecial #45                 // Method java/lang/Object."<init>":()V
       9: return
}


$ javap -c -private SecretAgent.class

public class SecretAgent extends Person {
  private final java.lang.String name;

  private final java.lang.String toString;

  public java.lang.String name();
    Code:
       0: aload_0
       1: getfield      #14                 // Field name:Ljava/lang/String;
       4: areturn

  public java.lang.String toString();
    Code:
       0: aload_0
       1: getfield      #18                 // Field toString:Ljava/lang/String;
       4: areturn

  public SecretAgent(java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #22                 // Method Person."<init>":(Ljava/lang/String;)V
       5: aload_0
       6: ldc           #24                 // String secret
       8: putfield      #14                 // Field name:Ljava/lang/String;
      11: aload_0
      12: ldc           #24                 // String secret
      14: putfield      #18                 // Field toString:Ljava/lang/String;
      17: return
}

*/