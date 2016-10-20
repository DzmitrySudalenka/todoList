package by.gsu.epamlab.model.beans;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import by.gsu.epamlab.Constants;

public enum TaskSection {
	TODAY(			Constants.ID_CHAR_TASK_SECTION_TODAY, 
					Constants.TITLE_TASKS_TODAY, 
					Constants.LABEL_TODAY, 
					Constants.SQL_SELECT_TASKS_TODAY, 
					false, 
					TaskStatus.ACTIVE), 
	TOMORROW(		Constants.ID_CHAR_TASK_SECTION_TOMORROW, 
					Constants.TITLE_TASKS_TOMORROW, 
					Constants.LABEL_TOMORROW, 
					Constants.SQL_SELECT_TASKS_TOMORROW, 
					false, 
					TaskStatus.ACTIVE) {
		public String getSectionDate() {
			Date date = new Date();
			Calendar calendar = Calendar.getInstance(); 
			calendar.setTime(date);
			calendar.add(Calendar.DATE, 1);
			date = calendar.getTime();
			String strDate = Constants.DATE_FORMAT.format(date);
			return strDate;
		}
	}, 
	SOMEDAY(		Constants.ID_CHAR_TASK_SECTION_SOMEDAY, 
					Constants.TITLE_TASKS_SOMEDAY, 
					Constants.LABEL_SOMEDAY, 
					Constants.SQL_SELECT_TASKS_SOMEDAY, 
					true, 
					TaskStatus.ACTIVE) {
		public boolean isSomeday() {
			return true;
		}
	}, 
	FIXED(			Constants.ID_CHAR_TASK_SECTION_FIXED, 
					Constants.TITLE_TASKS_FIXED, Constants.LABEL_FIXED, 
					Constants.SQL_SELECT_TASKS_FIXED, 
					true, 
					TaskStatus.FIXED), 
	RECYCLE_BIN(	Constants.ID_CHAR_TASK_SECTION_RECYCLE_BIN, 
					Constants.TITLE_TASKS_RECYCLE_BIN,  
					Constants.LABEL_RECYCLE_BIN, 
					Constants.SQL_SELECT_TASKS_MOVED_TO_RECYCLE_BIN, 
					true, 
					TaskStatus.MOVED_TO_RECYCLE_BIN);
	private final String id;
	private final String title;
	private final String label;
	private final String query;
	private final boolean showDate;
	private final TaskStatus tasksStatus;
	private static final Map<String, TaskSection> taskSections = 
			new HashMap<String, TaskSection>();
    static {
        for (TaskSection taskSection : TaskSection.values()) {
        	taskSections.put(taskSection.getId(), taskSection);
        }
    }
	private TaskSection(String id, String title, String label, String query, boolean showDate, 
			TaskStatus tasksStatus) {
		this.id = id;
		this.title = title;
		this.label = label;
		this.query = query;
		this.showDate = showDate;
		this.tasksStatus = tasksStatus;
	}
	public String getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getLabel() {
		return label;
	}
	public String getQuery() {
		return query;
	}
	public boolean isShowDate() {
		return showDate;
	}
	public TaskStatus getTasksStatus() {
		return tasksStatus;
	}
	public boolean isActiveStatuses() {
		if (TaskStatus.ACTIVE.equals(getTasksStatus())) {
			return true;
		}
		return false;
	}
	public boolean isMovedToRecycleBinStatuses() {
		if (TaskStatus.MOVED_TO_RECYCLE_BIN.equals(getTasksStatus())) {
			return true;
		}
		return false;
	}
	public boolean isNotMovedToRecycleBinStatuses() {
		if (!TaskStatus.MOVED_TO_RECYCLE_BIN.equals(getTasksStatus())) {
			return true;
		}
		return false;
	}
	public boolean isSomeday() {
		return false;
	}
	public String getSectionDate() {
		Date date = new Date();
		String strDate = Constants.DATE_FORMAT.format(date);
		return strDate;
	}
	public static TaskSection getTaskSectionById(String id) {
        return taskSections.get(id);
    }
}
