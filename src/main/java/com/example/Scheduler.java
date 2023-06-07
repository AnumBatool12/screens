package com.example;

import java.util.Date;
import java.util.ArrayList;
//Schedular Class

public class Scheduler {
	private ArrayList<Task> tasks;
	private Integer totalTasks;

	Scheduler(){
		tasks=new ArrayList<Task>();
		totalTasks=0;
	}

	//setter
	public void setDate(int index, Date date) {tasks.get(index).setDate(date); }
	public void setTask(int index, String task) {tasks.get(index).setDesc(task);}
	public void setAll(int index, String task, Date date){
		tasks.get(index).setDesc(task);
		tasks.get(index).setDate(date);
	}
	public void setStatus(int index, String stat){tasks.get(index).setStatus(stat);}
	public void addTask(Task task){
		tasks.add(task); 
		totalTasks++;
	}
	public void allNewTask(String task, Date date){
		Task newTask=new Task(date, task);
		newTask.setID(totalTasks);
		tasks.add(newTask);
		totalTasks++;
	} 
	public void setID(int id, int index){tasks.get(index).setID(id);}
	
	//getter
	public int getTotalTaskNo(){return totalTasks;}
	public Task getTask(int index){return tasks.get(index);}
	public Date getDate(int index) {return tasks.get(index).getDate();}
	public String getTaskdesc(int index){return tasks.get(index).getDesc();}
	public String getStat(int index) {return tasks.get(index).getStatus();}
	public int getID(int index){return tasks.get(index).getID();}

	public void removeTask(int index){tasks.remove(index);}
}