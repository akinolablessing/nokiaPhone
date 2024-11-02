import java.util.Scanner;
    public class Nokia{
      public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

      System.out.println("Nokia menu: \n 1.Phone book \n 2.Messages \n 3.Chat \n 4.Call register");
      int number = scanner.nextInt();
      
 switch(number){
  case 1:
      System.out.println("1.Search \n 2.Service Nos \n 3.Add name \n 4.Erase \n 5.Edit \n 6.Assign tone \n 7.Send b'card \n 8.Options \n 9.Speed dials \n 10.Voice tags");
  int select = scanner.nextInt();
    switch(select){
      case 1:
           System.out.print("Search......");
           break;
      case 2:
           System.out.print("Kindly enter your service numbers....");
           break;
      case 3:
           System.out.print("Kindly enter your name.....");
           break;
      case 4:
           System.out.print("Erase...");
           break;
      case 5:
           System.out.print("Edit...");
           break;
      case 6:
           System.out.print(" kindly assign tone......");
           break;
      case 7:
           System.out.print("Kindly send b'card.....");
           break;
      case 8:
           System.out.println("Pick an options:\n1.Type of view\n2.Memory status");
           break;
      case 9:
            System.out.print("Speed dials...");
            break;
       case 10:
            System.out.print("Voice tags....");
            break;
        }
   break;

 case 2:
  System.out.println("1.Write messages \n 2.Inbok \n 3.Outbok \n 4.Picture messages \n 5.Template \n 6.Smileys \n 7.Messages settings \n 8.Info service \n 9.Voice mailbox number \n 10.Service command editor ");
 int sets = scanner.nextInt();

 switch(sets){

  case 1:
      System.out.print("Write messages....");
      break;
  case 2:
      System.out.print("Inbok messages....");
      break;
  case 3:
      System.out.print("Outbok messages....");
      break;
  case 4:
      System.out.print("Picture messages...");
      break;
  case 5:
      System.out.print("Choose template of your choice....");
      break;
  case 6:
      System.out.print("Smileys....");
      break;
  case 7:
    System.out.println("Select one:\n 1.Sets \n2.Commom");
     int step = scanner.nextInt();
      switch(step){
       case 1:
           System.out.print("1.Message centre number \n2.Message sent as \n3.Message validity");
           break;
       case 2:
           System.out.print("1.Deliver reports \n2.Reply via same centre \n3.Character support");
        break;
      }
  break;
  } 
 break;


 case 3:
    System.out.print("Chat.....");
    break;

 case 4:
      System.out.println("1.Missed calls \n2.Received calls \n3.Dialled numbers \n4.Erase resent call lists \n5.Show call duration \n6.Show call costs \n7.Call cost settings \n8.Prepaid credit");
  int register= scanner.nextInt();
        switch(register){
         case 1:
              System.out.print("Missed calls.....");
         case 2:
              System,out.print("Received calls.....");
              break;
         case 3:
             System.out.print("Dialled numbers....");
             break;
         case 4:
           System.out.print("Erase resent call lists.....");
            break;

        case 5:
             System.out.println("1.Last call duration \n2.All call's duration \n3.Received call's duration \n4.Dialled call's duration \n5.Clear timers");
           break;
        case 6:
            System.out.println("1.Last call cost \n2.All call's cost \n3.Clear counters ");
            break;
        case 7:
            System.out.println("1.Call cost limit \n2.Show costs in");
            break;
        case 8;
            System.out.print("Prepaid credit.....");
        }
     break;
  }

 }
}
