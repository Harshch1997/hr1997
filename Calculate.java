package metro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author mohit dawar
 */
public class Calculate {
    
    
   static int blue[]={1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,19,20,21,22,23};
   static int green[]={24,26,27,28,29,30,31,32,33};
   static int red[]={35,36,37,38,39,40,41,42,43,45,46};
   static int yellow[]={47,48,49,50,51,52,53,54,55,56,57,58,59,60};
   static int joint[]={11,18,25,34,44};
    
   static boolean flagcb,flagdb,flagcg,flagdg,flagcr,flagdr,flagcy,flagdy,flagcj,flagdj;
   
   static List l;
   
   
    public static List distance(int cs_id, int d_id)
    {
         int b1=Arrays.binarySearch(blue, cs_id);
         int b2=Arrays.binarySearch(blue, d_id);
         int g1=Arrays.binarySearch(green, cs_id);
         int g2=Arrays.binarySearch(green, d_id);
         int r1=Arrays.binarySearch(red, cs_id);
         int r2=Arrays.binarySearch(red, d_id);
         int y1=Arrays.binarySearch(yellow, cs_id);
         int y2=Arrays.binarySearch(yellow, d_id);
         int j1=Arrays.binarySearch(joint, cs_id);
         int j2=Arrays.binarySearch(joint, d_id);
        
         
         if(b1>=0)
         flagcb=true;
         if(b2>=0)
         flagdb=true;
         if(g1>=0)
         flagcg=true;
         if(g2>=0)
         flagdg=true;
         if(r1>=0)
         flagcr=true;
         if(r2>=0)
         flagdr=true;
         if(y1>=0)
         flagcy=true;
         if(y2>=0)
         flagdy=true;
         if(j1>=0)
         flagcj=true;
         if(j2>=0)
         flagdj=true;
         
         
         
         if(flagcb&&flagdb)
         {
              l= new ArrayList(1000);
              
              if(cs_id<d_id)
              {
                  
                  int j=cs_id;
                  while(j<=d_id)
                  {
                      l.add(j);
                      
                      j++;
                  }
              }
              else
              {
                  
                  int j=cs_id;
                  while(j>=d_id)
                  {
                      l.add(j);
                      
                      j--;
                  }
              }
             
             
         }
         
         
       if(flagcb&&flagdg)
       {
           l= new ArrayList(1000);
              
           int j=cs_id;
           if(cs_id<11)
           {
              
               while(j<=11)
               {
                   l.add(j);
                   
                   j++;
               }
               
           }
           else
           {
               
            
               while(j>=11)
               {
                   l.add(j);
                   j--;
               }
            }
             j=24;
               while(j<=d_id)
               {
                   l.add(j);
                   j++;
                   
               }
       }
         
         
       if(flagcb&&flagdr)
       {
           l= new ArrayList(1000);
           int j=cs_id;
           
           if(cs_id<11)
           {
               while(j<=11)
               {
                   l.add(j);
                   
                   j++;
               }
               l.add(24);
               
               l.add(25);
               
               j=34;
               
              if(d_id<=40)
              {
                  while(j<=d_id)
                  {
                      l.add(j);
                      
                      j++;
                  }
              }
              else
              {
                  l.add(34);
                  j=41;
                  while(j<=d_id)
                  {
                      l.add(j);
                      j++;
                  }
              }
               
               
               
           }
           
       else{
              j=cs_id;
              while(j>=11)
              {
                  l.add(j);
                  j--;
              }
              l.add(24);
              l.add(25);
               j=34;
               
              if(d_id<=40)
              {
                  while(j<=d_id)
                  {
                      l.add(j);
                      
                      j++;
                  }
              }
              else
              {
                  l.add(34);
                  j=41;
                  while(j<=d_id)
                  {
                      l.add(j);
                      j++;
                  }
              }
              
               
           } 
           
           
       }
      
       if(flagcb&&flagdy)
       {
           int j=cs_id;
           l= new ArrayList(1000);
           if(cs_id<18)
           {
               while(j<=18)
               {
                   l.add(j);
                   j++;
                   
               }
               if(d_id<=55)
               {
                   j=47;
                   while(j<=d_id)
                   {
                       l.add(j);
                       j++;
                   }
               }
               else
               {
                   j=56;
                   while(j<=d_id)
                   {
                       l.add(j);
                       j++;
                   }
               }
           }
         else
           {
               j=cs_id;
               while(j>=18)
               {
                   l.add(j);
                   j--;
               }
               if(d_id<=55)
               {
                   j=47;
                   while(j<=d_id)
                   {
                       l.add(j);
                       j++;
                   }
               }
               else
               {
                   j=56;
                   while(j<=d_id)
                   {
                       l.add(j);
                       j++;
                   }
               }
               
               
           }
                    
       }    
       
       if(flagcg&&flagdg)
       {
           l= new ArrayList(1000);
           int j=cs_id;
           if(cs_id<d_id)
           {
             while(j<=d_id)
             {
               l.add(j);
               j++;
             }
           }
           else
           {
               while(j>=d_id)
               {
                   l.add(j);
                   j--;
               }
           }
       }
       if(flagcg&&flagdb)
       {
           int j=cs_id;
           l= new ArrayList(1000);
           while(j>=24)
           {
               l.add(j);
               j--;
           }
           l.add(11);
           if(d_id<11)
           {
               j=10;
               while(j>=d_id)
               {
                   l.add(j);
                   j--;
               }
           }
           else
           {
               j=12;
               while(j<=d_id)
               {
                   l.add(j);
                   j++;
               }
           }
       }
         
       if(flagcg&&flagdr)
       {
           int j=cs_id;
           l= new ArrayList(1000);
           if(cs_id>25)
           {
               while(j>=25)
               {
                   l.add(j);
                   j--;
               }
               j=34;
               if(d_id<=40)
               {
                   while(j<=d_id)
                   {
                       l.add(j);
                       j++;
                   }
               }
               else
               {
                   l.add(34);
                   j=41;
                   
                   while(j<=d_id)
                   {
                       l.add(j);
                       j++;
                   }
               }
           }else
           {
               l.add(24);
               l.add(25);
                j=34;
               if(d_id<=40)
               {
                   while(j<=d_id)
                   {
                       l.add(j);
                       j++;
                   }
               }
               else
               {
                   l.add(34);
                   j=41;
                   
                   while(j<=d_id)
                   {
                       l.add(j);
                       j++;
                   }
               }
           }
       }
       if(flagcg&&flagdy)
       {
           int j=cs_id;
           l= new ArrayList(1000);
           while(j>=24)
           {
               l.add(j);
               j--;
           }
           j=11;
           while(j<=18)
           {
               l.add(j);
               j++;
           }
           if(d_id<=55)
           {
               j=47;
               while(j<=d_id)
               {
                   l.add(j);
                   j++;
               }
           }else
           {
               j=56;
               while(j<=d_id)
               {
                   l.add(j);
                   j++;
               }
           }
       }
       
      if(flagcr&&flagdr)
      {
          int j=cs_id;
          l= new ArrayList(1000);
          
          if(cs_id<=40 && d_id<=40)
          {
              if(cs_id<d_id)
              {
                  while(j<=d_id)
                  {
                      l.add(j);
                      j++;
                      
                  }
              }
              else
              {
                  while(j>=d_id)
                  {
                      l.add(j);
                      j--;
                  }
              }
          }
          else if(cs_id>=41&&d_id>=41)
          {
               if(cs_id<d_id)
              {
                  while(j<=d_id)
                  {
                      l.add(j);
                      j++;
                      
                  }
              }
              else
              {
                  while(j>=d_id)
                  {
                      l.add(j);
                      j--;
                  }
              }
          }
          else if(cs_id<=40&&d_id>=41)
          {
            j=cs_id;
            while(j>=34)
            {
                l.add(j);
                j--;
            }
            j=41;
            while(j<=d_id)
            {
                l.add(j);
                j++;
            }
          }
          else if(cs_id>=41&&d_id<=40)
          {
              j=cs_id;
              while(j>=41)
              {
                  l.add(j);
                  
                  j--;
              }
              j=34;
              while(j<=d_id)
              {
                  l.add(j);
                  j++;
              }
          }
      }
      
     if(flagcr&&flagdb)
     {
         int j=cs_id;
         l= new ArrayList(1000);
         if(cs_id<=40)
         {
             while(j>=34)
             {
                 l.add(j);
                 j--;
             }
             l.add(25);
             l.add(24);
             l.add(11);
             if(d_id<11)
             {
                 j=10;
                 while(j>=d_id)
                 {
                     l.add(j);
                     j--;
                 }
             }
             else
             {
                 j=12;
                 while(j<=d_id)
                 {
                     l.add(j);
                     j++;
                 }
             }
         }
         else
         {
             j=cs_id;
             while(j>=41)
             {
                 l.add(j);
                 j--;
             }
             l.add(34);
             l.add(25);
             l.add(24);
             l.add(11);
             if(d_id<11)
             {
                 j=10;
                 while(j>=d_id)
                 {
                     l.add(j);
                     j--;
                 }
             }
             else
             {
                 j=12;
                 while(j<=d_id)
                 {
                     l.add(j);
                     j++;
                 }
             }
         }
     }
     if(flagcr&&flagdg)
     {
         int j=cs_id;
         l= new ArrayList(1000);
         
         if(cs_id<=40)
         {
             while(j>=34)
             {
                 l.add(j);
                 j--;
             }
             l.add(25);
             if(d_id>25)
             {
                 j=26;
                 while(j<=d_id)
                 {
                     l.add(j);
                     j++;
                 }
             }
             else
             {
                 l.add(24);
             }
         }
         else
         {
             j=cs_id;
             while(j>=41)
             {
                 l.add(j);
                 j--;
                 
             }
             l.add(34);
             l.add(25);
              if(d_id>25)
             {
                 j=26;
                 while(j<=d_id)
                 {
                     l.add(j);
                     j++;
                 }
             }
             else
             {
                 l.add(24);
             }
             
         }
     }
         
     if(flagcr&&flagdy)
     {
         int j=cs_id;
         l= new ArrayList(1000);
         
         if(cs_id<=40)
         {
             while(j>=34)
             {
                 l.add(j);
                 j--;
             }
             j=41;
             while(j<=44)
             {
                 l.add(j);
                 j++;
             }
             if(d_id>=56)
             {
                 j=60;
                 while(j>=d_id)
                 {
                     l.add(j);
                     j--;
                 }
             }
             else
             {
                 j=60;
                 while(j>=56)
                 {
                     l.add(j);
                     j--;
                 }
                 l.add(18);
                 j=47;
                 while(j<=d_id)
                 {
                     l.add(j);
                     j++;
                 }
             }
         }
         else
         {
             j=cs_id;
             if(cs_id<44)
             {
                while(j<=44)
                 {
                    l.add(j);
                    j++;
                 }
                
                if(d_id>=56)
               {
                 j=60;
                 while(j>=d_id)
                 {
                     l.add(j);
                     j--;
                 }
               }
                else
               {
                 j=60;
                 while(j>=56)
                 {
                     l.add(j);
                     j--;
                 }
                 l.add(18);
                 j=47;
                 while(j<=d_id)
                 {
                     l.add(j);
                     j++;
                 }
              }
          }
             else
             {
                 j=cs_id;
                 while(j>=44)
                 {
                     l.add(j);
                     j--;
                 }
                 
                   if(d_id>=56)
               {
                 j=60;
                 while(j>=d_id)
                 {
                     l.add(j);
                     j--;
                 }
               }
                else
               {
                 j=60;
                 while(j>=56)
                 {
                     l.add(j);
                     j--;
                 }
                 l.add(18);
                 j=47;
                 while(j<=d_id)
                 {
                     l.add(j);
                     j++;
                 }
              }
             }
         
     }
         
     }
     if(flagcy&&flagdy)
     {
         int j=cs_id;
         l= new ArrayList(1000);
         
         if(cs_id<=55 && d_id<=55)
         {
             if(cs_id<d_id)
             {
                 while(j<=d_id)
                 {
                     l.add(j);
                     j++;
                 }
             }
             else
             {
                 while(j>=d_id)
                 {
                     l.add(j);
                     j--;
                 }
             }
         }
         else if(cs_id>=56&&d_id>=56)
         {
            
             if(cs_id<d_id)
             {
                 while(j<=d_id)
                 {
                     l.add(j);
                     j++;
                 }
             }
             else
             {
                 while(j>=d_id)
                 {
                     l.add(j);
                     j--;
                 }
             } 
         }
         else if(cs_id<=55&&d_id>=56)
         {
             j=cs_id;
             while(j>=47)
             {
                 l.add(j);
                 j--;
             }
             l.add(18);
             j=56;
             while(j<=d_id)
             {
                 l.add(j);
                 j++;
             }
         }
         else if(cs_id>=56&&d_id<=55)
         {
             j=cs_id;
             while(j>=56)
             {
                 l.add(j);
                 j--;
             }
             l.add(18);
             j=47;
             while(j<=d_id)
             {
                 l.add(j);
                 j++;
             }
         }
          
     }
     if(flagcy&&flagdb)
     {
         int j=cs_id;
         l= new ArrayList(1000);
         
         if(cs_id<=55)
         {
             while(j>=47)
             {
                 l.add(j);
                 j--;
             }
             l.add(18);
             
           if(d_id<18)
           {
               j=17;
               while(j>=d_id)
               {
                   l.add(j);
                   j--;
               }
           }
           else
           {
               j=19;
               while(j<=d_id)
               {
                   l.add(j);
                   j++;
               }
           }
             
             
         }
         else if(cs_id>=56)
         {
             j=cs_id;
             while(j>=56)
             {
                 l.add(j);
                 j--;
             }
             l.add(18);
            if(d_id<18)
           {
               j=17;
               while(j>=d_id)
               {
                   l.add(j);
                   j--;
               }
           }
           else
           {
               j=19;
               while(j<=d_id)
               {
                   l.add(j);
                   j++;
               }
           } 
             
             
         }
     }
     if(flagcy&&flagdg)
     {
     
         int j=cs_id;
         l= new ArrayList(1000);
         
         if(cs_id<=55)
         {
             while(j>=47)
             {
                 l.add(j);
                 j--;
             }
             l.add(18);
             j=17;
             while(j>=11)
             {
                 l.add(j);
                 j--;
             }
             j=24;
             while(j<=d_id)
             {
                 l.add(j);
                 j++;
                         
             }
         }
         else if(cs_id>=56)
         {
             j=cs_id;
             while(j>=56)
             {
                 l.add(j);
                 j--;
                       
             }
             l.add(18);
             j=17;
             while(j>=11)
             {
                 l.add(j);
                 j--;
             }
             j=24;
             while(j<=d_id)
             {
                 l.add(j);
                 j++;
             }
         }
     }
     if(flagcy&&flagdr)
     {
         int j=cs_id;
         l= new ArrayList(1000);
         
         if(cs_id<=55)
         {
             while(j>=47)
             {
             l.add(j);
             j--;
             }
         
         l.add(18);
         j=56;
         while(j<=60)
         {
             l.add(j);
             j++;
         }
         l.add(44);
         if(d_id>44)
         {
             j=45;
             while(j<=d_id)
             {
             l.add(j);
             j++;
             }
         }
         else if(d_id<44&&d_id>=41)
         {
             j=43;
             while(j>=d_id)
             {
                 l.add(j);
                 j--;
             }
         }
         else if(d_id<=40)
         {
             j=43;
             while(j>=41)
             {
                 l.add(j);
                 j--;
             }
             l.add(34);
             j=35;
             while(j<=d_id)
             {
                 l.add(j);
                 j++;
             }
         }
     }else if(cs_id>=56)
     {
         j=cs_id;
         while(j<=60)
         {
             l.add(j);
             j++;
         }
         l.add(44);
         if(d_id>44)
         {
             j=45;
             while(j<=d_id)
             {
             l.add(j);
             j++;
             }
         }
         else if(d_id<44&&d_id>=41)
         {
             j=43;
             while(j>=d_id)
             {
                 l.add(j);
                 j--;
             }
         }
         else if(d_id<=40)
         {
             j=43;
             while(j>=41)
             {
                 l.add(j);
                 j--;
             }
             l.add(34);
             j=35;
             while(j<=d_id)
             {
                 l.add(j);
                 j++;
             }
         }
     }
         
   }   
   if(cs_id==11&&d_id==18)
     {
     
         int j=cs_id;
         l= new ArrayList(1000);
         
         while(j<=18)
         {
             l.add(j);
             j++;
         }
         
         
      }
    if(cs_id==11&&d_id==25)
      {
         int j=cs_id;
         l= new ArrayList(1000);
         l.add(11);
         l.add(24);
         l.add(25);
      }
     if(cs_id==11&&d_id==34)
     {
         int j=cs_id;
         l= new ArrayList(1000);
         l.add(11);
         l.add(24);
         l.add(25);
         l.add(34);
     }
     if(cs_id==11&&d_id==44)
     {
         int j=cs_id;
         l= new ArrayList(1000);
         l.add(11);
         l.add(24);
         l.add(25);
         l.add(34);
         j=41;
         while(j<=44)
         {
             l.add(j);
             j++;
         }
     }
     if(cs_id==18&&d_id==11)
     {
         int j=cs_id;
         l= new ArrayList(1000);
         while(j>=11)
         {
             l.add(j);
             j--;
         }
     }
     if(cs_id==18&&d_id==25)
     {
         int j=cs_id;
         l= new ArrayList(1000);
         while(j>=11)
         {
             l.add(j);
             j--;
         }
         l.add(24);
         l.add(25);
     }
     
     if(cs_id==18&&d_id==34)
     {
         int j=cs_id;
         l= new ArrayList(1000);
         while(j>=11)
         {
             l.add(j);
             j--;
         }
         l.add(24);
         l.add(25);
         l.add(34);
     }
     
     if(cs_id==18&&d_id==44)
     {
         int j=cs_id;
         l= new ArrayList(1000);
         while(j>=11)
         {
             l.add(j);
             j--; 
         }
         l.add(24);
         l.add(25);
         l.add(34);
         j=41;
         while(j<=44)
         {
             l.add(j);
             j++;
         }
     }
     if(cs_id==25&&d_id==11)
     {
         int j=cs_id;
         l= new ArrayList(1000);
         l.add(j);
         l.add(24);
         l.add(11);
     }
     if(cs_id==25&&d_id==18)
     {
         int j=cs_id;
         l= new ArrayList(1000);
         l.add(j);
         l.add(24);
         j=11;
         while(j<=18)
         {
             l.add(j);
             j++;
         }
     }
     if(cs_id==25&&d_id==34)
     {
         int j=cs_id;
         l= new ArrayList(1000);
         l.add(25);
         l.add(34);
     }
     if(cs_id==25&&d_id==44)
     {
          int j=cs_id;
         l= new ArrayList(1000);
         l.add(25);
         l.add(34);
         j=41;
         while(j<=44)
         {
             l.add(j);
             j++;
         }
     }
     if(cs_id==34&&d_id==11)
     {
          int j=cs_id;
         l= new ArrayList(1000);
         l.add(34);
         l.add(25);
         l.add(24);
         l.add(11);
     }
     if(cs_id==34&&d_id==18)
     {
          int j=cs_id;
         l= new ArrayList(1000);
         l.add(34);
         l.add(25);
         l.add(24);
         j=11;
         while(j<=18)
         {
             l.add(j);
             j++;
         }
         
     }
     if(cs_id==34&&d_id==25)
     {
          int j=cs_id;
         l= new ArrayList(1000);
         l.add(34);
         l.add(25);
     }
     if(cs_id==34&&d_id==44)
     {
      int j=cs_id;
         l= new ArrayList(1000);
         l.add(34);
         j=41;
         while(j<=44)
         {
             l.add(j);
             j++;
         }
     }
     if(cs_id==44&&d_id==11)
     {
          int j=cs_id;
         l= new ArrayList(1000);
         while(j>=41)
         {
             l.add(j);
             j--;
         }
         l.add(34);
         l.add(25);
         l.add(24);
         l.add(11);
     }
     if(cs_id==44&&d_id==18)
     {
          int j=cs_id;
         l= new ArrayList(1000);
          while(j>=41)
         {
             l.add(j);
             j--;
         }
         l.add(34);
         l.add(25);
         l.add(24);
         j=11;
         while(j<=18)
         {
             l.add(j);
             j++;
         }
     }
     if(cs_id==44&&d_id==25)
     {
          int j=cs_id;
         l= new ArrayList(1000);
          while(j>=41)
         {
             l.add(j);
             j--;
         }
         l.add(34);
         l.add(25);
     }
     if(cs_id==44&d_id==34)
     {
           int j=cs_id;
         l= new ArrayList(1000);
          while(j>=41)
         {
             l.add(j);
             j--;
         }
         l.add(34);
     }
     if(flagcb&&d_id==11)
     {
         int j=cs_id;
         l= new ArrayList(1000);
        
         if(cs_id<11)
         {
             while(j<=11)
             {
                 l.add(j);
                 j++;
             }
         }
          else
         {
             while(j>=11)
             {
                 l.add(j);
                 j--;
             }
         }
     }
     if(flagcb&&d_id==18)
     {
         int j=cs_id;
         l= new ArrayList(1000);
          
       if(cs_id<18)
       {
           
           while(j<=18)
           {
           l.add(j);
           j++;
           }
       }
       else
       {
         while(j>=18)
         {
             l.add(j);
             j--;
         }
       }
     }
     if(flagcb&&d_id==25)
     {
          int j=cs_id;
         l= new ArrayList(1000);
          if(cs_id<11)
          {
              while(j<=11)
              {
                  l.add(j);
                  j++;
              }
              l.add(24);
              l.add(25);
          }
          else
          {
              while(j>=11)
              {
                  l.add(j);
                  j--;
              }
              l.add(24);
              l.add(25);
          }
     }
     
     if(flagcb&&d_id==34)
     {
          int j=cs_id;
         l= new ArrayList(1000);
          if(cs_id<11)
          {
              while(j<=11)
              {
                  l.add(j);
                  j++;
              }
              l.add(24);
              l.add(25);
              l.add(34);
          }
          else
          {
              while(j>=11)
              {
                  l.add(j);
                  j--;
              }
              l.add(24);
              l.add(25);
              l.add(34);
          }
     }
     
      if(flagcb&&d_id==44)
     {
          int j=cs_id;
         l= new ArrayList(1000);
          if(cs_id<11)
          {
              while(j<=11)
              {
                  l.add(j);
                  j++;
              }
              l.add(24);
              l.add(25);
              l.add(34);
              j=41;
              while(j<=44)
              {
                  l.add(j);
                  j++;
              }
          }
          else
          {
              while(j>=11)
              {
                  l.add(j);
                  j--;
              }
              l.add(24);
              l.add(25);
              l.add(34);
              j=41;
              while(j<=44)
              {
                  l.add(j);
                  j++;
              }

          }
     }
    if(flagcg&&d_id==11)
    {
         int j=cs_id;
         l= new ArrayList(1000);
         
         while(j>=24)
         {
             l.add(j);
             j--;
         }
         l.add(11);
         
    }
     if(flagcg&&d_id==18)
    {
         int j=cs_id;
         l= new ArrayList(1000);
         
         while(j>=24)
         {
             l.add(j);
             j--;
         }
         j=11;
         while(j<=18)
         {
             l.add(j);
             j++;
         }
    } 
    if(flagcg&&d_id==25)
    {
         int j=cs_id;
         l= new ArrayList(1000);
         if(cs_id>25)
         {
             while(j>=25)
             {
                 l.add(j);
                 j--;
             }
         }
         else
         {
             l.add(24);
             l.add(25);
         }
    }
    if(flagcg&&d_id==34)
    {
         int j=cs_id;
         l= new ArrayList(1000);
         if(cs_id>25)
         {
             while(j>=25)
             {
                 l.add(j);
                 j--;
             }
             l.add(34);
         }
         else
         {
             l.add(24);
             l.add(25);
             l.add(34);
         }
    }
      
      if(flagcg&&d_id==44)
    {
         int j=cs_id;
         l= new ArrayList(1000);
         if(cs_id>25)
         {
             while(j>=25)
             {
                 l.add(j);
                 j--;
             }
             l.add(34);
             j=41;
             while(j<=44)
             {
                 l.add(j);
                 j++;
             }
         }
         else
         {
             l.add(24);
             l.add(25);
             l.add(34);
              j=41;
             while(j<=44)
             {
                 l.add(j);
                 j++;
             }
         }
    }
      
      if(flagcr&&d_id==11)
      {
           int j=cs_id;
           l= new ArrayList(1000);
           if(cs_id<=40)
           {
               while(j>=34)
               {
                   l.add(j);
                   j--;
               }
               l.add(25);
               l.add(24);
               l.add(11);
           }
           else
           {
               while(j>=41)
               {
                   l.add(j);
                   j--;
               }
               l.add(34);
               l.add(25);
               l.add(24);
               l.add(11);
           }
              
      }
      if(flagcr&&d_id==18)
      {
          int j=cs_id;
           l= new ArrayList(1000);
           if(cs_id<=40)
           {
               while(j>=34)
               {
                   l.add(j);
                   j--;
               }
               l.add(25);
               l.add(24);
               j=11;
               while(j<=18)
               {
                   l.add(j);
                   j++;
               }
           }
           else
           {
               while(j>=41)
               {
                   l.add(j);
                   j--;
               }
               l.add(34);
               l.add(25);
               l.add(24);
                j=11;
               while(j<=18)
               {
                   l.add(j);
                   j++;
               }
           }
      }
      if(flagcr&&d_id==25)
      {
           int j=cs_id;
           l= new ArrayList(1000);
           if(cs_id<=40)
           {
               while(j>=34)
               {
                   l.add(j);
                   j--;
               }
               l.add(25);
               
           }
           else
           {
               while(j>=41)
               {
                   l.add(j);
                   j--;
               }
               l.add(34);
               l.add(25);
               
           }
      }
      if(flagcr&&d_id==34)
      {
           int j=cs_id;
           l= new ArrayList(1000);
           if(cs_id<=40)
           {
               while(j>=34)
               {
                   l.add(j);
                   j--;
               }
               
           }
           else
           {
               while(j>=41)
               {
                   l.add(j);
                   j--;
               }
               l.add(34);
               
           }
      }
      if(flagcr&&d_id==44)
      {
           int j=cs_id;
           l= new ArrayList(1000);
           if(cs_id<=40)
           {
               while(j>=34)
               {
                   l.add(j);
                   j--;
               }
              
               j=41;
               while(j<=44)
               {
                   l.add(j);
                   j++;
               }
           }
           else
           {
               if(j<44)
               {
                   while(j<=44)
                   {
                       l.add(j);
                       j++;
                   }
               }
               else
               {
                   while(j>=44)
                   {
                       l.add(j);
                       j--;
                   }
               }
           }
      }
      if(flagcy&&d_id==11)
      {
           int j=cs_id;
           l= new ArrayList(1000);
           
           if(cs_id<=55)
           {
               while(j>=47)
               {
                   l.add(j);
                   j--;
               }
               l.add(18);
               j=17;
               while(j>=11)
               {
                   l.add(j);
                   j--;
                           
               }
           }
           else
           {
               while(j>=56)
                       {
                           l.add(j);
                           j--;
                       }
               l.add(18);
                j=17;
               while(j>=11)
               {
                   l.add(j);
                   j--;
                           
               }
           }
      }
      if(flagcy&&d_id==18)
      {
           int j=cs_id;
           l= new ArrayList(1000);
           
           if(cs_id<=55)
           {
               while(j>=47)
               {
                   l.add(j);
                   j--;
               }
               l.add(18);
           }
           else
           {
               while(j>=56)
               {
                   l.add(j);
                   j--;
               }
               l.add(18);
           }
      }
      if(flagcy&&d_id==25)
      {
           int j=cs_id;
           l= new ArrayList(1000);
            if(cs_id<=55)
           {
               while(j>=47)
               {
                   l.add(j);
                   j--;
               }
               l.add(18);
               j=17;
               while(j>=11)
               {
                   l.add(j);
                   j--;
                           
               }
               l.add(24);
               l.add(25);
           }
             else
           {
               while(j>=56)
                       {
                           l.add(j);
                           j--;
                       }
               l.add(18);
                j=17;
               while(j>=11)
               {
                   l.add(j);
                   j--;
                           
               }
               l.add(24);
               l.add(25);
           }
            
           
      }
      
      if(flagcy&&d_id==34)
      {
           int j=cs_id;
           l= new ArrayList(1000);
            if(cs_id<=55)
           {
               while(j>=47)
               {
                   l.add(j);
                   j--;
               }
               l.add(18);
               j=17;
               while(j>=11)
               {
                   l.add(j);
                   j--;
                           
               }
               l.add(24);
               l.add(25);
               l.add(34);
           }
             else
           {
               while(j>=56)
                       {
                           l.add(j);
                           j--;
                       }
               l.add(18);
                j=17;
               while(j>=11)
               {
                   l.add(j);
                   j--;
                           
               }
               l.add(24);
               l.add(25);
               l.add(34);
           }
            
           
      }
      if(flagcy&&d_id==44)
      {
           int j=cs_id;
           l= new ArrayList(1000);
            if(cs_id<=55)
           {
               while(j>=47)
               {
                   l.add(j);
                   j--;
               }
               l.add(18);
               j=17;
               while(j>=11)
               {
                   l.add(j);
                   j--;
                           
               }
               l.add(24);
               l.add(25);
               l.add(34);
              j=41;
              while(j<=44)
              {
                  l.add(j);
                  j++;;
              }
                       
           }
             else
           {
               while(j>=56)
                       {
                           l.add(j);
                           j--;
                       }
               l.add(18);
                j=17;
               while(j>=11)
               {
                   l.add(j);
                   j--;
                           
               }
               l.add(24);
               l.add(25);
               l.add(34);
                j=41;
              while(j<=44)
              {
                  l.add(j);
                  j++;;
              }
           }
            
           
      }
      
      if(cs_id==11&&flagdb)
      {
           int j=cs_id;
           l= new ArrayList(1000);
           if(d_id<11)
           {
               while(j>=d_id)
               {
               l.add(j);
               j--;
               }
           }
           else
           {
               while(j<=d_id)
               {
                   l.add(j);
                   j++;
               }
           }
      }
      if(cs_id==11&&flagdg)
      {
           int j=cs_id;
           l= new ArrayList(1000);
           l.add(j);
           j=24;
           while(j<=d_id)
           {
               l.add(j);
               j++;
           }
      }
      if(cs_id==11&&flagdr)
      {
           int j=cs_id;
           l= new ArrayList(1000);
           l.add(j);
           l.add(24);
           l.add(25);
           l.add(34);
           if(d_id<=40)
           {
               j=35;
               while(j<=d_id)
               {
               l.add(j);
               j++;
               } 
           }
           else
           {
               j=41;
               while(j<=d_id)
               {
                   l.add(j);
                   j++;
               }
           }
      }
     
      if(cs_id==11&&flagdy)
      {
           int j=cs_id;
           l= new ArrayList(1000);
           if(d_id<=55)
           {
               while(j<=18)
               {
                   l.add(j);
                   j++;
               }
               j=47;
               while(j<=d_id)
               {
                   l.add(j);
                   j++;
               }
           }
           else
           {
               while(j<=18)
               {
                   l.add(j);
                   j++;
               }
               j=56;
               while(j<=d_id)
               {
                   l.add(j);
                   j++;
               }
           }
      }
      
    if(cs_id==18&&flagdb)
    {
       int j=cs_id;
       l= new ArrayList(1000);
        if(d_id<18)
           {
               while(j>=d_id)
               {
               l.add(j);
               j--;
               }
           }
           else
           {
               while(j<=d_id)
               {
                   l.add(j);
                   j++;
               }
           }    
    }
    if(cs_id==18&&flagdg)
    {
       int j=cs_id;
       l= new ArrayList(1000);
       while(j>=11)
       {
           l.add(j);
           j--;
       }
       j=24;
       while(j<=d_id)
       {
           l.add(j);
           j++;
       }
    }
    if(cs_id==18&&flagdr)
    {
       int j=cs_id;
       l= new ArrayList(1000);
       
      while(j>=11)
      {
          l.add(j);
          j--;
      }
      l.add(24);
      l.add(25);
      l.add(34);
      
      if(d_id<=40)
      {
          j=35;
          while(j<=d_id)
          {
              l.add(j);
              j++;
          }
      }
      else
      {
          j=41;
          while(j<=d_id)
          {
              l.add(j);
              j++;
          }
      }
    }
     if(cs_id==18&&flagdy)
     {
         int j=cs_id;
       l= new ArrayList(1000);
       
       if(d_id<=55)
       {
           l.add(j);
           j=47;
           while(j<=d_id)
           {
               l.add(j);
               j++;
           }
       }
       else
       {
           l.add(j);
           j=56;
           while(j<=d_id)
           {
               l.add(j);
               j++;
           }
       }
     }
      if(cs_id==25&&flagdb)
      {
           int j=cs_id;
           l= new ArrayList(1000);
          l.add(j);
          l.add(24);
          l.add(11);
          if(d_id<11)
          {
              j=10;
              while(j>=d_id)
              {
                  l.add(j);
                  j--;
              }
          }
          else
          {
              j=12;
              while(j<=d_id)
              {
                  l.add(j);
                  j++;
              }
          }
      }
      if(cs_id==25&&flagdg)
      {
           int j=cs_id;
       l= new ArrayList(1000);
       l.add(j);
       if(d_id>25)
       {
           j=26;
           while(j<=d_id)
           {
           l.add(j);
           j++;
           }
       }
          else
       {
           l.add(24);
       }
          
          
          
      }
      if(cs_id==25&&flagdr)
      {
           int j=cs_id;
       l= new ArrayList(1000);
       l.add(j);
       l.add(34);
       if(d_id<=40)
       {
           j=35;
           while(j<=d_id)
           {
               l.add(j);
               j++;
           }
       }
       else
       {
           j=41;
           while(j<=d_id)
           {
               l.add(j);
               j++;
           }
       }
      }
      if(cs_id==25&&flagdy)
      {
           int j=cs_id;
       l= new ArrayList(1000);
       l.add(25);
       l.add(24);
       l.add(11);
       j=12;
       while(j<=18)
       {
           l.add(j);
           j++;
       }
       if(d_id<=55)
       {
           j=47;
           while(j<=d_id)
           {
               l.add(j);
               j++;
           }
       }
       else
       {
           j=56;
            while(j<=d_id)
           {
               l.add(j);
               j++;
           }
           
       }
          
          
          
      }
      if(cs_id==34&&flagdb)
      {
          
            int j=cs_id;
       l= new ArrayList(1000);
       l.add(j);
       l.add(25);
       l.add(24);
       l.add(11);
       if(d_id<11)
       {
           j=10;
           while(j>=d_id)
           {
               l.add(j);
               j--;
           }
       }
       else
       {
           j=12;
           while(j<=d_id)
           {
               l.add(j);
               j++;
           }
       }
          
          
      }
      if(cs_id==34&&flagdg)
      {
       int j=cs_id;
       l= new ArrayList(1000);
       l.add(j);
       l.add(25);
       if(d_id>25)
       {
           j=26;
           while(j<=d_id)
           {
           l.add(j);
           j++;
           }
       }
          else
       {
           l.add(24);
       }
      }
      if(cs_id==34&&flagdr)
      {
           int j=cs_id;
       l= new ArrayList(1000);
       l.add(j);
       if(d_id<=40)
       {
           j=35;
           while(j<=d_id)
           {
               l.add(j);
               j++;
           }
       }
       else
       {
           j=41;
           while(j<=d_id)
           {
               l.add(j);
               j++;
           }
       }
      }
      if(cs_id==34&&flagdy)
      {
         int j=cs_id;
       l= new ArrayList(1000);
       l.add(34);
       l.add(25);
       l.add(24);
       l.add(11);
       j=12;
       while(j<=18)
       {
           l.add(j);
           j++;
       }
       if(d_id<=55)
       {
           j=47;
           while(j<=d_id)
           {
               l.add(j);
               j++;
           }
       }
       else
       {
           j=56;
            while(j<=d_id)
           {
               l.add(j);
               j++;
           }
           
       }
           
      }
      if(cs_id==44&&flagdb)
      {
            int j=cs_id;
       l= new ArrayList(1000);
       while(j>=41)
       {
           l.add(j);
           j--;
       }
       l.add(34);
       l.add(25);
       l.add(24);
       l.add(11);
       if(d_id<11)
       {
           j=10;
           while(j>=d_id)
           {
               l.add(j);
               j--;
           }
       }
               
       else
       {
           j=12;
           while(j<=d_id)
           {
               l.add(j);
               j++;
           }
       }
      }
      if(cs_id==44&&flagdg)
      {
           int j=cs_id;
       l= new ArrayList(1000);
       while(j>=41)
       {
           l.add(j);
           j--;
       }
       l.add(34);
       l.add(25);
       if(d_id>25)
       {
           j=26;
           while(j<=d_id)
           {
               l.add(j);
               j++;
           }
       }
       else
       {
           l.add(24);
       }
      }
      if(cs_id==44&&flagdr)
      {
           int j=cs_id;
       l= new ArrayList(1000);
       if(d_id>44)
       {
           while(j<=d_id)
           {
               l.add(j);
           
              j++;
           }   
       }
       else if(d_id>40&&d_id<44)
       {
           l.add(44);
           j=43;
           while(j>=d_id)
           {
               l.add(j);
               j--;
           }
       }
       else
       {
           j=44;
           while(j>=41)
           {
               l.add(j);
               j--;
           }
           l.add(34);
           j=35;
           while(j<=d_id)
           {
               l.add(j);
               j++;
                       
           }
       }
      }
      if(cs_id==44&&flagdy)
      {
            int j=cs_id;
       l= new ArrayList(1000);
       while(j>=41)
       {
           l.add(j);
           j--;
       }
       l.add(34);
       l.add(25);
       l.add(24);
       l.add(11);
       j=12;
       while(j<=18)
       {
           l.add(j);
           j++;
       }
       if(d_id<=55)
       {
           j=47;
           while(j<=d_id)
           {
               l.add(j);
               j++;
           }
       }
       else
       {
           j=56;
           while(j<=d_id)
           {
               l.add(j);
               j++;
           }
       }
      }
      
         return l;
    }
    
    public static void main(String[] args) {
        
        List p=distance(44,60);
        Iterator i=p.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        
    }
}
