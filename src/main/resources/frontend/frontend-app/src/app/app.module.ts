import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { HeaderComponent } from './components/header/header.component';
import { HotelListComponent } from './components/hotel-list/hotel-list.component';
import { HotelListItemComponent } from './components/hotel-list/hotel-list-item/hotel-list-item.component';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import {HttpClientService} from "./service/http-client.service";
import {HttpClient, HttpClientModule} from "@angular/common/http";
import { NgbdButtonsCheckbox } from './components/button-checkbox/button-checkbox.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    HotelListComponent,
    HotelListItemComponent,
    NgbdButtonsCheckbox,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule,
    HttpClientModule
  ],
  exports: [
    HeaderComponent
  ],
  providers: [HttpClientService, HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule { }
