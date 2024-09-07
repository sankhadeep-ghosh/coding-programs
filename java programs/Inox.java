import java.io.*;
public class Inox
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String title="******************WELCOME TO INOX CINEMA*****************";
        String list[]=new String[19];//for Storing Movie names.
        list[0]="KURBAAN";list[1]="TWILIGHT";list[2]="A CHRISTMAD CAROL";list[3]="TUM MILE";list[4]="2012";list[5]="AJAB PREM KI GHAJAB KAHANI";
        list[6]="EK NIRANJAN";list[7]="AARYA 2";list[8]="KANDEIN KADHALAI";list[9]="PARICHAYA";list[10]="MAGADHEERA";list[11]="AADHAVAN";
        list[12]="PAJHASSIRAJA";list[13]="ALL THE BEST";list[14]="KURRADU";list[15]="JULIE AND JULIA";list[16]="MOORU GUTTO ONDHU SULLU";
        list[17]="VILLAGE LO VINAYAKUDU";list[18]="MANASAARE";
        String city[]=new String[6];//for Storing City names.
        city[0]="BANGALORE";city[1]="CHANDIGARH";city[2]="DELHI";city[3]="HYDERABAD";city[4]="MUMBAI";city[5]="KOLKATA";
        String cityN,movie,size;//declaration of String variables
        String ans="Q";String ans1="Q";
        int flag=0,flag1=0,flag2=0,flag3=0,flag4=0,catg,quantity,date,bvrg,tot_bvrg,snck,tot_snck,fd;
        int tot_fd=1,tot_d,d,ch;//declaration of Integer variables

  
        do
        {
            System.out.println();   
            System.out.println(title);
            System.out.println("*********************************************************");
            System.out.println();
            System.out.println("<<< SELECT YOUR CURRENT CITY >>>");

            do
            {
                if(flag>0)
                    System.out.println("** INVALID INPUT ! TRY AGAIN **");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("** BANGALORE CHANDIGARH DELHI HYDERABAD MUMBAI KOLKATA **");
                System.out.println();
                System.out.print("ENTER THE CORRECT CITY NAME FOR YOUR CHOICE :");
                cityN=br.readLine();
                for(int i=0;i<6;i++)
                {
                    if(city[i].equalsIgnoreCase(cityN))
                    {
                        flag=0;
                        break;
                    }
                    else
                        flag++;
                }
            }while(flag!=0);
            System.out.println("\f");//to clear the screen for next window
            System.out.println(title);
            System.out.println("*********************************************************");
            System.out.println("<<< SELECT YOUR CATAGORY TO WATCH THE MOVIE >>>");
            do
            {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("** 1.INOX "+cityN+" CLASSIC CINEMAS **");
                System.out.println("** 2.INOX "+cityN+" SUPER CLASSIC CINEMAS **");
                System.out.println();
                System.out.print("ENTER THE CORRECT CATEGORY NUMBER FOR YOUR CHOICE :");
                catg=Integer.parseInt(br.readLine());
                if((catg==1)||(catg==2))
                    flag1=0;
                else
                {
                    System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
                    flag1++;
                }
            }while(flag1!=0);
            System.out.println(title);
            System.out.println("*********************************************************");
            System.out.println("\f");//to clear the screen for next window
            System.out.println(title);
            System.out.println("*********************************************************");
            System.out.println();
            System.out.println("<<< INFORMATION >>>");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("  ! MOBILE AND INTERNET BOOKING IS ALSO AVAILABLE !");
            System.out.println("FOR MOBILE BOOKING CONTACT==411288598 FROM YOUR MOBILE");
            System.out.println("            ** PREMIUM RATES AAPLY **");
            System.out.println("FOR INTERNET BOOKING VISIT:http://www.inoxcinemas.com");
            System.out.println();
            System.out.println("** CATCH THE LATEST MOVIES AT INOX CINEMAS NEAR YOU **");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            System.out.println("<<< SELECT YOUR DATE FOR THE MOVIE >>>");
            do
            {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("** 1. THURSDAY, 26 NOVEMBOR [2009] **");
                System.out.println("** 2. FRIDAY,   27 NOVEMBOR [2009] **");
                System.out.println("** 3. SATURDAY, 28 NOVEMBOR [2009] **");
                System.out.println("** 4. SUNDAY,   29 NOVEMBOR [2009] **");
                System.out.println("** 5. MONDAY,   30 NOVEMBOR [2009] **");
                System.out.println("** 6. TUESDAY,  01 DECEMBER [2009] **");
                System.out.println("** 7. WEDNESDAY,02 DECEMBER [2009] **");
                System.out.println();
                System.out.print("ENTER THE CORRECT NUMBER FOR YOUR SELECTED DATE :");
                date=Integer.parseInt(br.readLine());
                if((date>=1)&&(date<=7))
                    flag2=0;
                else
                {
                    System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
                    flag2++;
                }
            }while(flag2!=0);
            System.out.println("\f");//to clear the screen for next window
            System.out.println(title);
            System.out.println("*********************************************************");
            System.out.println("<<< PLEASE ENTER THE NUMBER OF TICKTETS >>>");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("ENTER THE NUMBER OF TICKTETS :");
            quantity=Integer.parseInt(br.readLine());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\f");//to clear the screen for next window
            System.out.println(title);
            System.out.println("*********************************************************");
            if(catg==1)
            {
                System.out.println("<<< MOVIE SELECTION >>>");
                do
                {
                    if(flag3>0)
                        System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
                    System.out.println("************************** NOW SHOWING ***************************");
                    System.out.println("MOVIE NAME                    RATING      LANGUAGE    SHOW TIMINGS");
                    System.out.println();
                    System.out.println("KURBAAN                        A          HINDI       01:00pm,9:15pm");
                    System.out.println("TWILIGHT                       U/A        ENGLISH     06:15pm");
                    System.out.println("A CHRISTMAS CAROL              U          ENGLISH     03:20pm");
                    System.out.println("TUM MILE                       U/A        HINDI       06:15pm,9:20pm");
                    System.out.println("2012                           U/A        ENGLISH     12:45pm,1:05pm,3:20pm,9:05pm");
                    System.out.println("AJAB PREM KI GHAJAB KAHANI     U          HINDI       10:30am,12:45pm,1:05pm");
                    System.out.println("EK NIRANJAN                    U          TELUGU      12:15pm,9:45pm");
                    System.out.println("AARYA 2                        U          TELUGU      10:00am,12:15pm");
                    System.out.println("KANDEIN KADHALAI               U          TAMIL       01:00pm,4:05pm");
                    System.out.println("PARICHAYA                      U          KANNADA     01:20pm");
                    System.out.println("MAGADHEERA                     U          TELUGU      01:20pm");
                    System.out.println("AADHAVAN                       U          TAMIL       06:15pm");
                    System.out.println("PAJHASSIRAJA                   U/A        MALAYALAM   11:00am");
                    System.out.println("ALL THE BEST                   U          HINDI       03:40pm");
                    System.out.println("KURRADU                        U          TELUGU      01:20pm");
                    System.out.println("JULIE AND JULIA                U          HINDI       10:00 am");
                    System.out.println("MOORU GUTTO ONDHU SULLU        U          KANNADA     04:00 pm");
                    System.out.println("VILLAGE LO VINAYAKUDU          U          TELUGU      03:20pm");
                    System.out.println("MANASAARE                      U/A        KANNADA     09:00pm");
                    System.out.println();
                    System.out.print("ENTER THE NAME OF YOUR SELECTED MOVIE :");
                    movie=br.readLine();
                    for(int i=0;i<19;i++)
                    {
                        if(list[i].equalsIgnoreCase(movie))
                        {
                            flag3=0;   
                            break;
                        }
                        else
                            flag3++;
                    }
                }while(flag3!=0);
                System.out.println();
                System.out.println("<<< PLEASE COLLECT YOUR BILL >>>");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Movie Selected :"+movie);
                System.out.println("The Total Cost is Rs. "+(quantity*110));
                System.out.print("Your Seat Number/s is/ are ");
                for(int i=1;i<=quantity;i++)
                {
                    System.out.print(17+i+" ");
                }
                System.out.println();
            }
            if(catg==2)
            {
                System.out.println("<<< MOVIE SELECTION >>>");
                do
                {
                    if(flag3>0)
                        System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
                    System.out.println("************************** NOW SHOWING ***************************");
                    System.out.println("MOVIE NAME                    RATING      LANGUAGE    SHOW TIMINGS");
                    System.out.println();
                    System.out.println("KURBAAN                        A          HINDI       01:00pm,9:15pm");
                    System.out.println("TWILIGHT                       U/A        ENGLISH     06:15pm");
                    System.out.println("TUM MILE                       U/A        HINDI       06:15pm,9:20pm");
                    System.out.println("2012                           U/A        ENGLISH     12:45pm,1:05pm,3:20pm,9:05pm");
                    System.out.println("AJAB PREM KI GHAJAB KAHANI     U          HINDI       10:30am,12:45pm,1:05pm");
                    System.out.println("EK NIRANJAN                    U          TELUGU      12:15pm,9:45pm");
                    System.out.println("AARYA 2                        U          TELUGU      10:00am,12:15pm");
                    System.out.println("KANDEIN KADHALAI               U          TAMIL       01:00pm,4:05pm");
                    System.out.println("MAGADHEERA                     U          TELUGU      01:20pm");
                    System.out.println("AADHAVAN                       U          TAMIL       06:15pm");
                    System.out.println("ALL THE BEST                   U          HINDI       03:40pm");
                    System.out.println("KURRADU                        U          TELUGU      01:20pm");
                    System.out.println("JULIE AND JULIA                U          HINDI       10:00 am");
                    System.out.println("VILLAGE LO VINAYAKUDU          U          TELUGU      03:20pm");
                    System.out.println("MANASAARE                      U/A        KANNADA     09:00pm");
                    System.out.println();
                    System.out.print("ENTER THE NAME OF YOUR SELECTED MOVIE :");
                    movie=br.readLine();
                    for(int i=0;i<19;i++)
                    {
                        if((i==2)||(i==9)||(i==12)||(i==16))
                            i++;
                        if(list[i].equalsIgnoreCase(movie))
                        {
                            flag3=0;
                            break;
                        }
                        else
                            flag3++;
                    }
                }while(flag3!=0);
                System.out.println();
                System.out.println("<<< PLEASE COLLECT YOUR BILL >>>");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Movie Selected :"+movie);
                System.out.println("The Total Cost is Rs. "+(quantity*150));
                System.out.print("Your Seat Number/s is/ are ");
                for(int i=1;i<=quantity;i++)
                {
                    System.out.print(135+i+" ");
                }
                System.out.println();
            }
            System.out.println("*********************************************************");
            System.out.println("************ THANK YOU FOR BUYING TICKETS ***************");
            System.out.println();
            System.out.println("*****************UPCOMMING RELEASES********************");
            System.out.println("RADIO                       HINDI");
            System.out.println("ROCKET SINGH                HINDI");
            System.out.println("PAA                         HINDI");
            System.out.println("AVATAR                      ENGLISH");
            System.out.println("3 IDIOTS                    HINDI");
            System.out.println("MY NAME IS KHAN             HINDI");
            System.out.println("PYAAR IMPOSSIBLE            HINDI");
            System.out.println("KITES                       HINDI");
            System.out.println("THE TWILIGHT SAGA:NEW MOON  ENGLISH");
            System.out.println("LAW ABIDING CITIZEN         ENGLISH");
            System.out.println("BRUNO                       ENGLISH");
            System.out.println("CHANCE PE DANCE             HINDI");
            System.out.println("********************************************************");
            System.out.println();
            System.out.println("TO QUIT BUYING TICKETS ENTER 'Q'");
            ans=br.readLine();

            System.out.println("\f");//to clear the screen for next window
            System.out.println(title);
            System.out.println("*********************************************************");
            do
            {
                System.out.println("*********** WELCOME TO THE SNACK BAR OF INOX ************");
                System.out.println();
                System.out.println("<<< STALL 1 >>>");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("********** SECTION : CHILLED BEVERAGES **********");
                System.out.println();
                System.out.println("1. COCA COLA            2. SPRITE");
                System.out.println("3. FRUITI               4. SEVEN UP");
                System.out.println("5. DIET PEPSI           6. COLD COFEE");
                System.out.println("7. ICE TEA              8. CHOCOLATE KRUSHERS");
                System.out.println("9. BLACKBERRY KRUSHERS  10.LEMON N ICETEA");
                System.out.println();
                System.out.println("********** SECTION : PIPING HOT DRINKS **********");
                System.out.println();
                System.out.println("11. TEA REGULAR         12. HOT LEMON TEA");
                System.out.println("13. ESPRESSO            14. CAFEMACHO");
                System.out.println("15. CAPPUCINO           16. CAFE LATTE");
                System.out.println("17. IRISH COFEE");
                System.out.println();
                String flagC1=new String();    
                System.out.print("DO YOU WANT YO BUY ANYTHING HERE ?(Y/N):");
                flagC1=br.readLine();
                System.out.println();
                if(flagC1.equalsIgnoreCase("Y"))
                {
                    System.out.print("CHOOSE YOUR BEVERAGE BY ENTERING THE NUMBER :");
                    bvrg=Integer.parseInt(br.readLine());
                    System.out.print("ENTER THE TOTAL NUMBER OF BEVERAGE YOU WANT TO BUY :");
                    tot_bvrg=Integer.parseInt(br.readLine());
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println();
                    System.out.println("<<< STALL 1 BILL >>>");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    if(bvrg>=1 && bvrg<=7)
                        System.out.println("TOTAL COST IS RS."+(tot_bvrg*45));
                    else if (bvrg>=8 && bvrg<=10)
                        System.out.println("THE TOTAL COST IN Rs"+(tot_bvrg*55));
                    else if (bvrg>=11 && bvrg<=12)
                        System.out.println("THE TOTAL COST IN Rs"+(tot_bvrg*65));
                    else if (bvrg>=13 && bvrg<=17)
                        System.out.println("THE TOTAL COST IN Rs"+(tot_bvrg*75));
                    System.out.println();
                }
                else
                    System.out.println();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("<<< STALL 2 >>>");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("************* SECTION : QUICK BITES *************");
                System.out.println();
                System.out.println();
                System.out.println("18. POP CORN[REGULAR]             19. POP CORN[CHEESE]");
                System.out.println("20. POP CORN[CARAMEL]             21. POP CORN[TANGY TOMATO]");
                System.out.println("22. VEG SAMOSA                    23. VEG PUFF");
                System.out.println("24. VEG QUICHE                    25. VEG PIZZA");
                System.out.println("26. VEG CROISSANT                 27. VEG BURGER");
                System.out.println("28. FRENCH FRIES                  29. CHICKEN PUFF ROLL");
                System.out.println("30. MULTI GRAIN CHICKEN SANDWICH  31. FOCCACCIA CHICKEN SANDWICH");
                System.out.println("32. CHICKEN SUBMARINE");
                String flagC2=new String();
                System.out.println();
                System.out.print("DO YOU WANT YO BUY ANYTHING HERE ?(Y/N):");
                flagC2=br.readLine();
                System.out.println();
                if(flagC2.equalsIgnoreCase("Y"))
                {
                    System.out.println("CHOOSE YOUR SNACK BY ENTERING THE NUMBER");
                    snck=Integer.parseInt(br.readLine());
                    System.out.println();
                    System.out.println("ENTER THE TOTAL NUMBER OF SNACKS YOU WANT TO BUY");
                    tot_snck=Integer.parseInt(br.readLine());
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println();
                    System.out.println("<<< STALL 2 BILL >>>");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    if(snck>=18 && snck<=21)
                    {
                        System.out.println("ENTER 'S' FOR SMALL,'M' FOR MEDIUM,'L' FOR LARGE");
                        size=br.readLine();
                        if(size.equalsIgnoreCase("S"))
                            System.out.println("TOTAL COST IS RS."+tot_snck*45);
                        else if(size.equalsIgnoreCase("M"))
                            System.out.println("TOTAL COST IS RS."+tot_snck*55);
                        else if(size.equalsIgnoreCase("L"))
                            System.out.println("TOTAL COST IS RS."+tot_snck*65);
                    }
                    else if(snck>=22 && snck <=23)
                        System.out.println("TOTAL COST IS RS."+tot_snck*40);
                    else if(snck>=24 && snck <=25)
                        System.out.println("TOTAL COST IS RS."+tot_snck*65);
                    else if(snck>=26 && snck <=27)
                        System.out.println("TOTAL COST IS RS."+tot_snck*75);
                    else if(snck==28)
                        System.out.println("TOTAL COST IS RS."+tot_snck*35);
                    else if(snck>=29 && snck <=31)
                        System.out.println("TOTAL COST IS RS."+tot_snck*95);
                    else if(snck==32)
                        System.out.println("TOTAL COST IS RS."+tot_snck*105);
                }

                else
                    System.out.println();
                System.out.println("<<< STALL 3 >>>");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("************* SECTION : MAIN COURSE *************");
                System.out.println();
                System.out.println("33. PAV BHAJI               34. CHANNA BHATURA");
                System.out.println("35. SCHEZWAN FRIED RICE     36. CHICKEN BIRYANI"); 
                System.out.println("37. CHICKEN NOODLES");
                System.out.println();
                String flagC3=new String();
                System.out.print("DO YOU WANT YO BUY ANYTHING HERE ?(Y/N):");
                flagC3=br.readLine();
                System.out.println();
                if(flagC3.equalsIgnoreCase("Y"))
                {
                    System.out.println("CHOOSE YOUR MAIN COURSE BY ENTERING THE NUMBER :");
                    fd=Integer.parseInt(br.readLine());
                    if(fd==33 || fd==34)
                        System.out.println("TOTAL COST IS RS."+tot_fd*46);
                    else if(fd==35)
                        System.out.println("TOTAL COST IN RS."+tot_fd*60);
                    else if(fd==36 || fd==37)
                        System.out.println("TOTAL COST IN RS."+tot_fd*86);
                }
                System.out.println("<<< STALL 4 >>>");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("*** SECTION : MELTING MOMENTS DESERTS ***");
                System.out.println();
                System.out.println("38. BANANA CHOCOLATE MOUSSE     39. BANANA CARAMEL PIE");
                System.out.println("40. CHOCOLATE/WALNUT BROWNIE    41. CHOCOLATE DOUGHNUT");
                System.out.println("42. MARBEL CAKE                 43. MOCHA MAGIC");
                System.out.println("44. BLACK FOREST GATEAUX");
                String flagC4=new String();
                System.out.print("DO YOU WANT YO BUY ANYTHING HERE ?(Y/N):");
                flagC4=br.readLine();
                System.out.println();
                if(flagC4.equalsIgnoreCase("Y"))
                {
                    System.out.println("CHOOSE YOUR DESSERT BY ENTERING THE NUMBER");
                    d=Integer.parseInt(br.readLine());
                    System.out.println("ENTER THE TOTAL NUMBER OF ITEMS YOU WANT TO BUY");
                    tot_d=Integer.parseInt(br.readLine());
                    if(d==38 || d==39)
                        System.out.println("TOTAL COST IN RS."+tot_d*55);
                    else if(d==40 || d==41)
                        System.out.println("TOTAL COST IN RS."+tot_d*45);
                    else if(d==42)
                        System.out.println("TOTAL COST IN RS."+tot_d*60);
                    else if(d==43 || d==44)
                        System.out.println("TOTAL COST IN RS."+tot_d*65);
                }
                else
                    System.out.println();
                System.out.println("TO QUIT BUYING FOOD ENTER 'Q'");
                ans1=br.readLine();
            }while((ans1.equalsIgnoreCase("Q"))!=true);
            System.out.println("\f");//to clear the screen for next window
            System.out.println(title);
            System.out.println("*********************************************************");
            System.out.println();
            System.out.println("<<< CANCELLATION OF TICKETS >>>");
            do
            {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("1. TO CANCEL TICKET");
                System.out.println("2. TO SKIP PROCESS");
                System.out.print("ENTER YOUR CHOICE NUMBER :");
                ch=Integer.parseInt(br.readLine());
                if(ch==1)
                {
                    System.out.println("YOU HAVE CHOOSEN TO CANCEL THE TICKETS");
                    flag4=0;
                    cancel();
                }
                else if(ch==2)
                {
                    System.out.println("** YOU HAVE CHOOSEN NOT TO CANCEL THE TICKETS **");
                    System.out.println("               ** THANK YOU **");
                    flag4=0;
                }
                else
                {
                    System.out.println(" ### INVALID CHOICE ###");
                    flag4++;
                }
            }while(flag4!=0);
        }while(ans1.equalsIgnoreCase("Q")!=true);
    }

    public static void cancel() throws Exception
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int date,catg,quantity,seat_no,flag1=0,flag2=0;
        String movie,shw_time;
        System.out.println("*** TODAYS DATE: 8,DECEMBER[FRIDAY] 2010");
        System.out.println("*** TIME: 5:00pm");
        System.out.println("**************************************************************");
        System.out.println("YOU CANNOT CANCEL YOUR TICKETS FOR ANY SHOW BEFORE THIS TIMING");
        System.out.println("<<< SELECT YOUR CATEGORY TO CANCEL TICKETS >>>");
        do
        {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("** 1.INOX CLASSIC CINEMAS **");
            System.out.println("** 2.INOX SUPER CLASSIC CINEMAS **");
            System.out.println();
            System.out.print("ENTER THE CORRECT CATEGORY NUMBER FOR YOUR CHOICE :");
            catg=Integer.parseInt(br.readLine());
            if((catg==1)||(catg==2))
                flag1=0;
            else
            {
                System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
                flag1++;
            }
        }while(flag1!=0);
        System.out.println("\f");//to clear the screen for next window
        switch(catg)
        {
            case 1:
                System.out.println("***************** INOX CLASSIC CINEMAS *********************");
                System.out.println();
                System.out.println("<<< SELECT YOUR DATE FOR CANCELLATION >>>");
                do
                {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("** 1. THURSDAY, 26 NOVEMBOR [2009] **");
                    System.out.println("** 2. FRIDAY,   27 NOVEMBOR [2009] **");
                    System.out.println("** 3. SATURDAY, 28 NOVEMBOR [2009] **");
                    System.out.println("** 4. SUNDAY,   29 NOVEMBOR [2009] **");
                    System.out.println("** 5. MONDAY,   30 NOVEMBOR [2009] **");
                    System.out.println("** 6. TUESDAY,  01 DECEMBER [2009] **");
                    System.out.println("** 7. WEDNESDAY,02 DECEMBER [2009] **");
                    System.out.println();
                    System.out.print("ENTER THE CORRECT NUMBER FOR YOUR SELECTED DATE :");
                    date=Integer.parseInt(br.readLine());
                    if((date>=1)&&(date<=7))
                        flag2=0;
                    else
                    {
                        System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
                        flag2++;
                    }
                }while(flag2!=0);
                System.out.println("PLEASE ENTER THE NAME OF THE MOVIE YOU WOULD LIKE TO CANCEL");
                movie=br.readLine();
                System.out.println("PLEASE ENTER THE SHOW TIMINGS");
                shw_time=br.readLine();
                System.out.println("PLEASE ENTER THE QUANTITY OF TICKETS");
                quantity=Integer.parseInt(br.readLine());
                System.out.println("PLEASE ENTER THE SEAT NUMBER");
                seat_no=Integer.parseInt(br.readLine());
                System.out.println();
                System.out.println("YOUR TICKETS HAVE BEEN SUCCESSFULLY CANCELLED");
                break;

            case 2:
                System.out.println("**************** INOX SUPER CLASSIC CINEMAS *****************");
                System.out.println();
                System.out.println("<<< SELECT YOUR DATE FOR CANCELLATION >>>");
                do
                {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("** 1. THURSDAY, 26 NOVEMBOR [2009] **");
                    System.out.println("** 2. FRIDAY,   27 NOVEMBOR [2009] **");
                    System.out.println("** 3. SATURDAY, 28 NOVEMBOR [2009] **");
                    System.out.println("** 4. SUNDAY,   29 NOVEMBOR [2009] **");
                    System.out.println("** 5. MONDAY,   30 NOVEMBOR [2009] **");
                    System.out.println("** 6. TUESDAY,  01 DECEMBER [2009] **");
                    System.out.println("** 7. WEDNESDAY,02 DECEMBER [2009] **");
                    System.out.println();
                    System.out.print("ENTER THE CORRECT NUMBER FOR YOUR SELECTED DATE :");
                    date=Integer.parseInt(br.readLine());
                    if((date>=1)&&(date<=7))
                        flag2=0;
                    else
                    {
                        System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
                        flag2++;
                    }
                }while(flag2!=0);
                date=Integer.parseInt(br.readLine());
                System.out.println("PLEASE ENTER THE NAME OF THE MOVIE YOU LIKE TO CANCEL");
                movie=br.readLine();
                System.out.println("PLEASE ENTER THE SHOW TIMINGS");
                shw_time=br.readLine();
                System.out.println("PLEASE ENTER THE QUANTITY OF TICKETS");
                quantity=Integer.parseInt(br.readLine());
                System.out.println("PLEASE ENTER THE SEAT NUMBER");
                seat_no=Integer.parseInt(br.readLine());
                System.out.println();
                System.out.println("YOUR TICKETS HAVE BEEN SUCCESSFULLY CANCELLED");
                break;
        }
    }
}
