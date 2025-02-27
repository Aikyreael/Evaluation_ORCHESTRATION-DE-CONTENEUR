import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {MessageListComponent} from './components/message-list/message-list.component';

@Component({
  selector: 'app-root',
  imports: [MessageListComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'frontend';
}
