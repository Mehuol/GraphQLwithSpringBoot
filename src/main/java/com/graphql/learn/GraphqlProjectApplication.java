package com.graphql.learn;

import com.graphql.learn.entities.Book;
import com.graphql.learn.services.BookService;
import org.hibernate.internal.util.collections.Stack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;
	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);

	}

//	public Boolean checkString(String str){
//		int openParanthesisCount = 0;
//		int openSquareBracketCount = 0;
//		int openRoundBracketCount = 0;
//		for (char ch : str.toCharArray()){
//
//
//			switch (ch){
//				case '{': openParanthesisCount++;
//				break;
//				case '(': openRoundBracketCount ++;
//				break;
//				case '[':openSquareBracketCount++;
//				break;
//				case '}' :openParanthesisCount --;
//				break;
//				case ')': openRoundBracketCount --;
//				break;
//				case ']': openSquareBracketCount--;
//			}
//
//			if (openParanthesisCount < 0 || openRoundBracketCount <0 || openSquareBracketCount< 0){
//				return false;
//			}
//		}
//
//		return openParanthesisCount == 0 && openSquareBracketCount == 0 && openRoundBracketCount==0;
//	}
	@Override
	public void run(String... args) throws Exception {
//		String str = "[({{}})]}}}}";
//		if (checkString(str)) {
//			System.out.println("Balanced");
//		} else {
//			System.out.println("Not Balanced");
//		}
		Book b1 = new Book();
		b1.setTitle("Book 1");
		b1.setDesc("For learning GraphQL with Java");
		b1.setPages(2000);
		b1.setPrice(6000);
		b1.setAuthor("Mehuol Dhanji");

		Book b2 = new Book();
		b2.setTitle("Book 2");
		b2.setDesc("For learning GraphQL with Java");
		b2.setPages(1500);
		b2.setPrice(4000);
		b2.setAuthor("Mehuol Ghavri");

		Book b3 = new Book();
		b3.setTitle("Book 3");
		b3.setDesc("For learning GraphQL with Java");
		b3.setPages(2500);
		b3.setPrice(8000);
		b3.setAuthor("M.D.G");

		bookService.create(b1);
		bookService.create(b2);
		bookService.create(b3);
	}

}
