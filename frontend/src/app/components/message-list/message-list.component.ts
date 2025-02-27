import {Component, OnInit} from '@angular/core';
import {MessageService} from '../../services/message.service';
import {NgForOf} from '@angular/common';
import {FormsModule} from '@angular/forms';

@Component({
  selector: 'app-message-list',
  imports: [
    NgForOf,
    FormsModule
  ],
  templateUrl: './message-list.component.html',
  styleUrl: './message-list.component.css'
})
export class MessageListComponent implements OnInit {
  messages: { content: string }[] = [];
  newMessage: string = '';

  constructor(private messageService: MessageService) {}

  ngOnInit(): void {
    this.loadMessages();
  }

  loadMessages(): void {
    this.messageService.getMessages().subscribe((data: { content: string; }[]) => {
      this.messages = data;
    });
  }

  sendMessage(): void {
    if (this.newMessage.trim()) {
      const message = { content: this.newMessage };
      this.messageService.sendMessage(message).subscribe((data: { content: string; }) => {
        this.messages.push(data);
        this.newMessage = '';
      });
    }
  }
}
