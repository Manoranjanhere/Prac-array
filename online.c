#include <stdio.h> 
#include <string.h>
int c1=0,c2=0,c3=0,c4=0,c5=1;
struct voter{
char name[50];
int age;
char username[50];
char password[50];
int voterid;
char address[50];
};
void registration();
void login();
void update();
void posi_vote();
void vote();
void displayresult();

// ---------------------MODULE 1ST-----------------

void registration(struct voter v){
FILE *log;
log=fopen("login.txt","a");
if(log==NULL){
system("cls");
printf("ERROR OPENING FILE\n");
exit(1);
}
fprintf(log,"%s %s %s %d %d %s\n",v.username,v.password,v.name,v.age,v.voterid,v.address);
fclose(log);
system("CLS");
printf("REGISTRATION SUCCESSFUL\nNOW PLEASE LOGIN\n");
login();
}

// ------------------module 2nd--------------
void login(){
char username[50];
char password[50];
FILE *fp1;
int flag=0;
fp1=fopen("login.txt","r");
struct voter v;
printf("ENTER USERNAME\n");
scanf("%s",&username);
printf("ENTER PASSWORD\n");
scanf("%s",&password);
if(fp1==NULL){
system("cls");
printf("ERROR OPENIING FILE\n");
exit(1);
}
while(fscanf(fp1,"%s %s %s %d %d%s\n",v.username,v.password,v.name,&v.age,&v.voterid,v.address)!=EOF){
if (strcmp(v.username,username) == 0 && strcmp(v.password,password) == 0){
flag=1;
printf("YOU HAVE SUCCESSFULLY LOGGED IN");
system("cls");
break;
}}
fclose(fp1);
if(flag==0){
printf("YOU DO NOT HAVE AN ACCOUNT YET.\n REGISTER PLEASE");
}
else{
system("cls");
printf("DO YOU WANT TO\n");
printf("1.GIVE VOTE\n");
printf("2.POSITIONS OF VOTING\n");
printf("3.UPDATE PROFILE\n");
printf("ENTER YOUR CHOICE\n");
int choice;
scanf("%d",&choice);
switch(choice){
case 1: posi_vote();
break;
case 2: posi_vote();
break;
case 3: update();
break;
default:
printf("INVALID INPUT\n");
}
} 
}

// ----------------------------Module 3rd------------------------
void update(){
struct voter v;
printf("ENTER YOUR NEW DETAILS\n");
printf("ENTER YOUR ADDRESS\n");
scanf("%s",v.address);
vote();
}

// -----------------------------Module 4th----------------------
void posi_vote(){
printf("\t\t\tWELCOME TO VOTING list\n");
printf("CANDIDATES ARE :\n");
printf("1.KUMAR\n");
printf("2.MANORANJAN\n");
printf("3.PANKAJ\n");
printf("4.JITENDRA\n");
printf("VOTING DAY IS 17-04-2023\nVOTING TIME IS 10 AM TO 6PM\n");
printf("PLEASE GIVE VOTE ACCORDING TO DATE\n");
vote();}


// ---------------------------Module 5th-------------------------
void vote()
{ struct voter v;
int vote;
printf("ENTER USERNAME:");
scanf("%s",v.username);
printf("ENTER PASSWORD:");
scanf("%s",v.password);
printf("ENTER YOUR VOTE:\n");
scanf("%d",&vote);
switch(vote){
case 1:
c1++;
break;
case 2:
c2++;
break;
case 3:
c3++;
break;
case 4:
c4++;
break;
default:
printf("WRONG CHOICE"); 
}
system("cls");
}
void displayresult(){
if(c1>c2 && c1>c3 && c1 >c4) {
printf("KUMAR LEADING");}
else if (c2>c3 && c2>c4 && c2 >c1) {
printf("MANORANJAN LEADING");}
else if(c3>c4 && c3>c2 && c3 >c1) {
printf("PANKAJ LEADING");}
else if(c4>c1 && c4>c2 && c4>c3) {
printf("JITENDRA LEADING");}
else
printf("----- Warning !!! No-win situation----"); 
} 
int main(){
int age;
char name[50];
system("cls");
printf("\t\t\t\tWELCOME TO ONLINE VOTING SYSTEM\n");
printf("1.REGISTER\n");
printf("2.LOGIN\n");
printf("3.UPDATE PROFILE\n");
printf("4.CHOOSE POSITIONS FOR VOTING\n");
printf("5.GIVE VOTE\n");
int choice;
struct voter v;
printf("ENTER YOUR CHOICE\n");
scanf("%d",&choice);
switch(choice){
case 1:
system("cls");
printf("\t\t\t\tWELCOME TO REGISTRATION\n");
printf("PLEASE ENTER YOUR NAME\n");
scanf("%s",&v.name);
printf("ENTER YOUR AGE\n");
scanf("%d",&v.age);
printf("ENTER A USERNAME(NO SPECIAL CHARACERS ALLOWED)\n");
scanf("%s",&v.username);
printf("ENTER A PASSWORD\n");
scanf("%s",&v.password);
printf("Enter YOUR ADDRESS\n");
scanf("%s",&v.address);
v.voterid=rand();
registration(v);
break;
case 2:
login();
break;
case 3:
update();
break;
case 4:posi_vote();
break; 
case 5:posi_vote();
break;
default:
printf("WRONG CHOICE INPUT"); 
}
printf("CURRENTLY LEADING\n");
displayresult();
return 0; 
}
