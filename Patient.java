class Patient{

static int patientId;
static String patientName ;
static char gender = '@' + '0';


public static void main(String pat[]){
//manage data for patient

System.out.println("The patient Id is:" +patientId);
// default Ref for String :0
System.out.println("The patient Name is:" +patientName);
System.out.println("The gender of the patient is:"+gender);
//default Ref for non-primitive datatype:null
//default Ref for double,float : 0.0
//default Ref for short,byte,int :0
//default Ref for char : space

}
}