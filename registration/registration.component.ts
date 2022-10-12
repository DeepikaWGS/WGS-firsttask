import { Component, OnInit } from '@angular/core';
import { Register } from '../register';
import { HttpClient } from '@angular/common/http';
import { UserService } from '../user.service';
@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {


  register:Register=new Register("",0,0,0,"","","");
  // url="http://localhost:8081/addingdetails";
message:any;
  constructor(private service:UserService){
}
  
ngOnInit() {

}

public registerNow(){
  let resp=this.service.doRegistration(this.register);
  resp.subscribe((data)=>this.message=data);
   
}

 

}
