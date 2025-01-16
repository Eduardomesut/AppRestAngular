import { Component, OnInit } from '@angular/core';
import {Book} from '../models/book';
import { BookServiceService } from '../services/book-service.service';
import { error } from 'console';


@Component({
  selector: 'app-book-list',
  imports: [],
  templateUrl: './book-list.component.html',
  styleUrl: './book-list.component.css'
})
export class BookListComponent implements OnInit{

  books?: Book[];
  
  constructor(private bookService:BookServiceService){

  }
  ngOnInit(): void {
      this.fetchBooks();
  }
  private fetchBooks() {
    this.bookService.findAll().subscribe({
      next: value =>{
        this.books = value
        console.log(value)
      },
      error: error =>{console.log(error)}
    })
    
  }


}
