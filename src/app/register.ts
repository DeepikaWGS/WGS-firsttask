export class Register{

   
    name:string;
    age: number ; 
    totalExperience:number;
    relevantExperience:number;
    skills:string;
    maritialStatus:string;
    location:string;



constructor(a:string,b:number,c:number,d:number,e:string,f:string,g:string)
{
    this.age=b;
    this.name=a;
    this.totalExperience=c; 
    this.relevantExperience=d;
    this.skills=e;
    this.maritialStatus=f;
    this.location=g;

}
}