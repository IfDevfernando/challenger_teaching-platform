package challenger_teaching.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import challenger_teaching.entities.Lesson;
import challenger_teaching.entities.Task;
import challenger_teaching.entities.Video;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("============== CHALLENGER TEACHING PLATFORM =============");
		System.out.println();
		System.out.print("How many classes are in the class? ");
		int n = sc.nextInt();
		
		List<Lesson> lesson = new ArrayList<>();
		
		for(int x=0; x < n; x++) {
			
			System.out.println("Class data ( "+(x+1)+" )");
			System.out.print("Content or Task: (C/T)");
			char choice = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("Title: ");
			String title = sc.next();
			sc.nextLine();
			System.out.print("Video URL: ");
			String url = sc.next();
			System.out.print("Duration in seconds:");
			int seconds = sc.nextInt();
			
			if(choice == 'c' ) {
				Lesson video = new Video(title, url, seconds);
				
				
				lesson.add(video);
				
				
			}
			if(choice == 't') {
				Lesson task = new Task(title, url, seconds);
				lesson.add(task);
			
			}
			
			
			
			
		}
		
			int total =0;
			for(Lesson less: lesson) {
				total += less.duration();
			}
			System.out.println("TOTAL COURSE DURATION: "+total+ " seconds");
		
		
		
		
		sc.close();
	}
	
	

}
