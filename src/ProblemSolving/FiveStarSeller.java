package ProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FiveStarSeller {
	
	static double threshold;
	static int additinal5Stars;
	
	static double totalPercetage;
	
	static int size;
	
	
	 public static int fiveStarReviews(int[][] productRatings, int ratingsThreshold) {		 
		 
		 int numRats = productRatings.length;
		 threshold = ratingsThreshold;
				 
		 
		List<List<Integer>> rating = new ArrayList<>();
		for(int i =0; i< numRats; i++) {
			List<Integer> list = Arrays.asList(productRatings[i][0],productRatings[i][1]);
			rating.add(list);
		}
	 
		 PriorityQueue<Rating> rats = new PriorityQueue<>(
		 rating.stream().map(r -> new Rating(r.get(0), r.get(1))).collect(Collectors.toList()));

	
		 double diff = threshold / 100.0 - rats.stream().mapToDouble(r -> r.value()).sum() / numRats;
	
		 int count = 0;
		 while (diff > 0) {
				Rating s = rats.poll();
				rats.offer(s.succ());
				diff -= s.gain() / numRats;
				count++;
	 }
	
	
		return count;
	 }
	 
	 static class Rating implements Comparable<Rating> {
	 int num;
	 int den;
	 public Rating(int num, int den) {
	 this.num = num;
	 this.den = den;
	 }
	public double value() {
	return (double)num / den;
	}
	public Rating succ() {
	return new Rating(num + 1, den + 1);
}
	 public double gain() {
	 return succ().value() - value();
	 }
	public int compareTo(Rating other) {
	return -Double.compare(gain(), other.gain());
	}
		
	 }

	 
	static int calculateMaxPercetage(double avg, PriorityQueue<ReviewSet> que) {
		PriorityQueue<ReviewSet> queue = new PriorityQueue<ReviewSet>(percetageComparator);
			if(avg >= threshold) return additinal5Stars;
			else {
				
				if(que.peek().percetage ==1) {
					que.poll();
					calculateMaxPercetage(avg,que);
				}
				else {				
					while(!que.isEmpty()) {
//						que.element().setFiveStarReview();
//						que.element().setTotalReviews();
//						que.element().setPercetage();
						queue.add(que.poll());
					}
		
					totalPercetage += queue.peek().getDiffPercetage();
					 avg = totalPercetage/size *100;
					 additinal5Stars++;
					 que.add(queue.poll());
					 while(!queue.isEmpty()) {
						 queue.element().setBackFiveStarReview();
						 queue.element().setBackTotalReviews();
//						 queue.element().setPercetage();
						 que.add(queue.poll());
						 
					 }
				}
				
				return calculateMaxPercetage(avg,que);
			}
			
	}
	

	 public static Comparator<ReviewSet> percetageComparator = new Comparator<ReviewSet>() {
		 public int compare(ReviewSet p1, ReviewSet p2) {
				if(p1.getPercetage() < p2.getPercetage()) return 1;
				else if(p1.getPercetage() > p2.getPercetage()) return -1;
				return 0;
			}
		 
	};
	

	 
	static class ReviewSet {
		 int fiveStarReviews;
		 int totalReviews;
		 double percetage;
		 
		 double diffPercetage;
		 
		 
		 public ReviewSet(int fiveStarReview, int totalReviews) {
			 this.fiveStarReviews = fiveStarReview;
			 this.totalReviews = totalReviews;
			 this.percetage = (double)fiveStarReviews/totalReviews;

		 }
		 
		public ReviewSet succ() {
			return new ReviewSet(fiveStarReviews+1, totalReviews+1);
		}
		 
		 public void setBackFiveStarReview() {
			 this.fiveStarReviews -= 1;
		 }
		 
		 public void setBackTotalReviews() {
			 this.totalReviews -= 1;
		 }

		 public double getPercetage() {
			 return (double) fiveStarReviews/totalReviews;
		 }
		 
		 public double getDiffPercetage() {
		return succ().getPercetage()-getPercetage();
		 }
		 
	 }

}