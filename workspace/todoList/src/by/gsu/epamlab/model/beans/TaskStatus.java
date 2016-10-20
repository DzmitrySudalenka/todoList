package by.gsu.epamlab.model.beans;

import java.util.HashMap;
import java.util.Map;

import by.gsu.epamlab.Constants;

public enum TaskStatus {
	ACTIVE(					Constants.ID_CHAR_TASK_STATUS_ACTIVE, 
							Constants.SQL_UPDATE_TASK_STATUS_TO_ACTIVE), 
	FIXED(					Constants.ID_CHAR_TASK_STATUS_FIXED, 
							Constants.SQL_UPDATE_TASK_STATUS_TO_FIXED), 
	MOVED_TO_RECYCLE_BIN(	Constants.ID_CHAR_TASK_STATUS_MOVED_TO_RECYCLE_BIN, 
							Constants.SQL_UPDATE_TASK_STATUS_TO_MOVED_TO_RECYCLE_BIN);
	private final String id;
	private final String query;
	private static final Map<String, TaskStatus> taskStatuses = 
			new HashMap<String, TaskStatus>();
    static {
        for (TaskStatus taskStatus : TaskStatus.values()) {
        	taskStatuses.put(taskStatus.getId(), taskStatus);
        }
    }
	private TaskStatus(String id, String query) {
		this.id = id;
		this.query = query;
	}
	public String getId() {
		return id;
	}
	public String getQuery() {
		return query;
	}
	public static TaskStatus getTaskStatusById(String id) {
        return taskStatuses.get(id);
    }
}
