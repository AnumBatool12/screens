package com.example;

import java.util.Date;
import java.util.ArrayList;
//Schedular Class

public class Scheduler {
	private ArrayList<Task> tasks;
	private int totalTasks;

	Scheduler(){
		tasks=new ArrayList<Task>();
	}

	//setter
	public void setDate(Integer index, Date date) {
		tasks.get(index).setDate(date);
	}
	public void setTask(Integer index, String task) {
		tasks.get(index).setDesc(task);
	}
	public void setAll(Integer index, String task, Date date){
		tasks.get(index).setDesc(task);
		tasks.get(index).setDate(date);
	}
	public void setStatus(Integer index, String stat){
		tasks.get(index).setStatus(stat);
	}
	public void addTask(Task task){tasks.add(task);}

	public int getTotalTaskNo(){return totalTasks;}

	//getter
	public Task getTask(Integer index){return tasks.get(index);}
	public Date getDate(Integer index) {return tasks.get(index).getDate();}
	public String getTaskdesc(Integer index){return tasks.get(index).getDesc();}
	public String getStat(Integer index) {return tasks.get(index).getStatus();}

}