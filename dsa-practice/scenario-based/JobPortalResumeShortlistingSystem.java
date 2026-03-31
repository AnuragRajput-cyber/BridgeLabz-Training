package dsa_practice.scenario_based;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class InvalidResumeException extends Exception{
	public InvalidResumeException(String message) {
		super(message);
	}
}
class Resume{
	String name;
	private Set<String>skills;
	private int match;
	public Resume(String name,Set<String>skills) throws InvalidResumeException {
		
		if (name==null||name.isEmpty()||skills==null||skills.isEmpty()) {
			throw new InvalidResumeException("Invalid resume data");
		}
		this.name=name;
		this.skills=skills;
	}
	@Override
	public String toString() {
		return "Resume [name=" + name + ", match=" + match + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getSkills() {
		return skills;
	}
	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}
	public int getMatch() {
		return match;
	}
	public void setMatch(int match) {
		this.match = match;
	}
	
}
public class JobPortalResumeShortlistingSystem {
	public static void main(String[] args) {
		try {
			Set<String>requiredSkills=Set.of("java","sql","python");
			List<Resume>resumes=Arrays.asList(
					new Resume("Anurag",Set.of("React","Java")),
					new Resume("Aditya",Set.of("python","Java")),
					new Resume("AAkash",Set.of("Go","angular"))
					);
			
			for(Resume r:resumes) {
				int count=0;
				for(String skills:r.getSkills()) {
					if(requiredSkills.contains(skills.toLowerCase())) {
						count++;
					}
				}
				r.setMatch(count);
			}
			
			resumes.sort(new Comparator<Resume>(){
				@Override
			    public int compare(Resume r1, Resume r2) {
			        return Integer.compare(r2.getMatch(), r1.getMatch());
			    }
			});
			 System.out.println("Shortlisted Resumes:");
	            for (Resume r : resumes) {
	                System.out.println(r);
	            }
			
		}catch(InvalidResumeException e) {
			e.printStackTrace();
		}
	}
}
