package by.gsu.epamlab;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public final class Constants {
	public static final String DB_DRIVER = "org.gjt.mm.mysql.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost/todoList";
	public static final String DB_LOGIN = "epamlab";
	public static final String DB_PASSWORD = "111";
	public static final String ID_CHAR_TASK_SECTION_TODAY = "today";
    public static final String ID_CHAR_TASK_SECTION_TOMORROW = "tomorrow";
    public static final String ID_CHAR_TASK_SECTION_SOMEDAY = "someday";
    public static final String ID_CHAR_TASK_SECTION_FIXED = "fixed";
    public static final String ID_CHAR_TASK_SECTION_RECYCLE_BIN = "recycleBin";
    public static final String ID_CHAR_TASK_STATUS_ACTIVE = "active";
    public static final String ID_CHAR_TASK_STATUS_FIXED = "fixed";
    public static final String ID_CHAR_TASK_STATUS_MOVED_TO_RECYCLE_BIN = "movedToRecycleBin";
    private static final String ID_NUM_TASK_STATUS_ACTIVE = "1";
    private static final String ID_NUM_TASK_STATUS_FIXED = "2";
    private static final String ID_NUM_TASK_STATUS_MOVED_TO_RECYCLE_BIN = "3";
    public static final String PATH_DEFAULT = "/";
    private static final String PATH_ACCOUNT = "/account/";
    private static final String PATH_CSS = "/css/";
    private static final String RESOURSE_CSS_STYLE = "style.css";
    private static final String RESOURSE_VIEW_MAIN = "main.jsp";
    private static final String RESOURSE_VIEW_LOGIN = "login.jsp";
    private static final String RESOURSE_VIEW_REGISTRATE = "registrate.jsp";
    private static final String RESOURSE_VIEW_TASKS = "tasks.jsp";
    private static final String RESOURSE_VIEW_TASK_ADD = "taskAdd.jsp";
    private static final String RESOURSE_VIEW_TASK_FILE_ATTACH = "taskFileAttach.jsp";
    private static final String RESOURSE_CONTROLLER_LOGIN = "LoginController";
    private static final String RESOURSE_CONTROLLER_REGISTRATE = "RegistrateController";
    private static final String RESOURSE_CONTROLLER_LOGOUT = "LogoutController";
    private static final String RESOURSE_CONTROLLER_TASK_ADD = "TaskAddController";
    private static final String RESOURSE_CONTROLLER_TASKS = "TasksController";
    private static final String RESOURSE_CONTROLLER_TASKS_CHANGE_STATUS = 
    		"TasksChangeStatusController";
    private static final String RESOURSE_CONTROLLER_TASKS_DELETE = 
    		"TasksDeleteController";
    private static final String RESOURSE_CONTROLLER_TASK_FILE_ATTACH = 
    		"TaskFileAttachController";
    private static final String RESOURSE_CONTROLLER_TASK_FILE_DOWNLOAD = 
    		"TaskFileDownloadController";
    private static final String RESOURSE_CONTROLLER_TASK_FILE_DELETE = 
    		"TaskFileDeleteController";
    private static final String QUERY_SECTION = "?section=";
    public static final String RESOURSE_PATH_CSS_STTYLE = PATH_CSS + RESOURSE_CSS_STYLE;
	public static final String JUMP_VIEW_MAIN = PATH_DEFAULT + RESOURSE_VIEW_MAIN;
	public static final String JUMP_VIEW_LOGIN = PATH_DEFAULT + RESOURSE_VIEW_LOGIN;
	public static final String JUMP_VIEW_REGISTRATE = PATH_DEFAULT + RESOURSE_VIEW_REGISTRATE;
	public static final String JUMP_VIEW_TASKS = PATH_ACCOUNT + RESOURSE_VIEW_TASKS;
	public static final String JUMP_VIEW_TASK_ADD = 
			PATH_ACCOUNT + RESOURSE_VIEW_TASK_ADD;
	public static final String JUMP_VIEW_TASK_FILE_ATTACH = 
			PATH_ACCOUNT + RESOURSE_VIEW_TASK_FILE_ATTACH;
	public static final String JUMP_CONTROLLER_TASK_ADD = 
			PATH_ACCOUNT + RESOURSE_CONTROLLER_TASK_ADD;
	public static final String JUMP_CONTROLLER_TASKS_CHANGE_STATUS = 
			PATH_ACCOUNT + RESOURSE_CONTROLLER_TASKS_CHANGE_STATUS;
	public static final String JUMP_CONTROLLER_TASKS = 
			PATH_ACCOUNT + RESOURSE_CONTROLLER_TASKS;
	public static final String JUMP_CONTROLLER_TASKS_SECTION = 
			JUMP_CONTROLLER_TASKS + QUERY_SECTION;
	public static final String JUMP_CONTROLLER_TASKS_DELETE = 
			PATH_ACCOUNT + RESOURSE_CONTROLLER_TASKS_DELETE;
	public static final String JUMP_CONTROLLER_TASKS_TODAY = 
			JUMP_CONTROLLER_TASKS_SECTION + ID_CHAR_TASK_SECTION_TODAY;
	public static final String JUMP_CONTROLLER_TASK_FILE_ATTACH = 
			PATH_ACCOUNT + RESOURSE_CONTROLLER_TASK_FILE_ATTACH;
	public static final String JUMP_CONTROLLER_TASK_FILE_DOWNLOAD = 
			PATH_ACCOUNT + RESOURSE_CONTROLLER_TASK_FILE_DOWNLOAD;
	public static final String JUMP_CONTROLLER_TASK_FILE_DELETE = 
			PATH_ACCOUNT + RESOURSE_CONTROLLER_TASK_FILE_DELETE;
	public static final String SEND_LOGIN = PATH_DEFAULT + RESOURSE_CONTROLLER_LOGIN;
	public static final String SEND_REGISTRATE = PATH_DEFAULT + RESOURSE_CONTROLLER_REGISTRATE;
	public static final String SEND_LOGOUT = PATH_ACCOUNT + RESOURSE_CONTROLLER_LOGOUT;
	public static final String SEND_FILE = PATH_ACCOUNT + RESOURSE_CONTROLLER_TASK_FILE_ATTACH;
	public static final String KEY_FORM_LOGIN = "loginForm";
	public static final String KEY_FORM_LOGOUT = "logoutForm";
	public static final String KEY_FORM_REGISTRATE = "registrateForm";
	public static final String KEY_FORM_TASKS = "tasksForm";
	public static final String KEY_FORM_TASK_ADD = "taskAddForm";
	public static final String KEY_FORM_TASK_FILE_ATTACH = "taskFileAttachForm";
	public static final String KEY_LOGIN = "login";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_REPEAT_PASSWORD = "repeatPassword";
    public static final String KEY_USER = "user";
    public static final String KEY_REPORT_MESSAGE = "reportMessage";
    public static final String KEY_TASKS = "tasks";
    public static final String KEY_TASK_SECTION = "taskSection";
    public static final String KEY_TASK_ID = "taskId";
    public static final String KEY_TASK_IDS = "taskIds";
    public static final String KEY_SECTION = "section";
    public static final String KEY_NEW_STATUS = "newStatus";
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_DATE = "date";
    public static final String KEY_DATE_DEFAULT = "defaultDate";
    public static final String KEY_DELETE = "delete";
    public static final String KEY_FILE_NAME = "fileName";
    public static final String KEY_CONTENT_DISPOSITION = "Content-disposition";
    public static final String VALUE_EMPTY = "";
    public static final String VALUE_SELECTED = "selected";
    public static final String VALUE_ALL = "all";
    public static final String VALUE_ATTACHMENT = "attachment; filename=";
    public static final String REPORT_LOGIN_OR_PASSWORD_ABSENT = 
    		"Login or password are absent.";
    public static final String REPORT_NO_USER = "No such user.";
    public static final String REPORT_WRONG_PASSWORD = "Wrong password.";
    public static final String REPORT_USER_EXIST = 
    		"A user with this login already exists.";
    public static final String REPORT_PASSWORDS_NOT_MATCH = 
    		"The passwords do not match.";
    public static final String REPORT_LOAD = "Wrong load data.";
    public static final String REPORT_RESOURCE_CLOSE = 
    		"Statement closing problem : ";
    public static final String REPORT_DATE_NO = "No date.";
    public static final String REPORT_DATE_WRONG_FORMAT = "Wrong date format.";
    public static final String REPORT_TASKS_NOT_SELECTED = "Tasks are not selected.";
    public static final String REPORT_DESCRIPTION_EMPTY = "Empty description.";
    public static final String REPORT_FILE_NOT_SELECTED = "File is not selected.";
    public static final String TITLE_MAIN = "Main";
    public static final String TITLE_LOGIN = "Login";
    public static final String TITLE_REGISTRATE = "Registrate";
    public static final String TITLE_TASKS_TODAY = "Today tasks";
    public static final String TITLE_TASKS_TOMORROW = "Tomorrow tasks";
    public static final String TITLE_TASKS_SOMEDAY = "Someday tasks";
    public static final String TITLE_TASKS_FIXED = "Fixed tasks";
    public static final String TITLE_TASKS_RECYCLE_BIN = "Recycle bin tasks";
    public static final String TITLE_TASK_ADD = "Add task";
    public static final String TITLE_TASK_FILE_ATTACH = "Attach file";
    public static final String TEXT_MAIN = 
    		"Please login or register, if you don't have an account.";
    public static final String TEXT_HI = "Hi ";
    public static final String TEXT_YOU_ROLE = "! You role is ";
    public static final String TEXT_DOT = ".";
    public static final String TEXT_NO_TASKS = 
    		"There are no tasks in this section.";
    public static final String LABEL_MAIN = "Main";
    public static final String LABEL_LOGIN = "Login";
    public static final String LABEL_REGISTRATE = "Registrate";
    public static final String LABEL_LOGOUT = "Logout";
    public static final String LABEL_ENTER = "Enter";
    public static final String LABEL_DEVELOPED_BY = "Developed by";
    public static final String LABEL_TODAY = "Today";
    public static final String LABEL_TOMORROW = "Tomorrow";
    public static final String LABEL_SOMEDAY = "Someday";
    public static final String LABEL_FIXED = "Fixed";
    public static final String LABEL_RECYCLE_BIN = "Recycle Bin";
    public static final String LABEL_ADD = "Add";
    public static final String LABEL_FIX = "Fix";
    public static final String LABEL_MOVE_TO_RECYCLE_BIN = "Move to recycle bin";
    public static final String LABEL_RESTORE = "Restore";
    public static final String LABEL_DELETE = "Delete";
    public static final String LABEL_DELETE_ALL = "Delete all";
    public static final String LABEL_CANCEL = "Cancel";
    public static final String LABEL_ATTACH = "Attach";
    public static final String LABEL_DESCRIPTION = "Description";
    public static final String LABEL_DATE = "Date";
    public static final String LABEL_FILE = "File";
    public static final String LABEL_DOWNLOAD = "Download";
    public static final String FORM_LABEL_LOGIN = "Login:";
    public static final String FORM_LABEL_PASSWORD = "Password:";
    public static final String FORM_LABEL_REPEAT_PASSWORD = "Repeat password:";
    public static final String AUTHOR_NAME = "Sudalenka Dzmitry";
    public static final String AUTHOR_EMAIL = "sudalenko@gmail.com";
    public static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    public static final String FILE_PATH_SEPARATOR = "\\";
    public static final String FILE_NAME_SEPARATOR = "_";
    public static final String FILE_FOLDER_NAME = "attachedFiles";
    public static final int FILE_BUFFER_SIZE = 4096;
    public static final String CHARSET_CP1251 = "Cp1251";
    public static final String CHARSET_CP1252 = "Cp1252";
	public static final String SQL_SELECT_USER = ""
			+ "SELECT userId,userRoleId,userPass "
			+ "FROM users "
			+ "WHERE userLogin = ?";
	public static final String SQL_INSERT_USER = ""
			+ "INSERT "
			+ "INTO users(userRoleId,userLogin,userPass) "
			+ "VALUES (2,?,?)";
	private static final String SQL_SELECT_TASKS_BEGIN = ""
			+ "SELECT * "
			+ "FROM tasks "
			+ "LEFT JOIN taskFiles "
			+ "ON tasks.taskId = taskFiles.taskId "
			+ "WHERE userId = ? ";
	private static final String SQL_SELECT_TASKS_END = ""
			+ "ORDER BY tasks.taskId DESC";
	private static final String SQL_SELECT_TASKS_MIDDLE_TODAY = ""
			+ "AND taskDate <= CURDATE() "
			+ "AND taskStatId = 1 ";
	private static final String SQL_SELECT_TASKS_MIDDLE_TOMORROW = ""
			+ "AND taskDate = CURDATE() + INTERVAL 1 DAY "
			+ "AND taskStatId = 1 ";
	private static final String SQL_SELECT_TASKS_MIDDLE_SOMEDAY = ""
			+ "AND taskStatId = 1 ";
	private static final String SQL_SELECT_TASKS_MIDDLE_FIXED = ""
			+ "AND taskStatId = 2 ";
	private static final String SQL_SELECT_TASKS_MIDDLE_MOVED_TO_RECYCLE_BIN = ""
			+ "AND taskStatId = 3 ";
	public static final String SQL_SELECT_TASKS_TODAY = ""
			+ SQL_SELECT_TASKS_BEGIN 
			+ SQL_SELECT_TASKS_MIDDLE_TODAY
			+ SQL_SELECT_TASKS_END;
	public static final String SQL_SELECT_TASKS_TOMORROW = ""
			+ SQL_SELECT_TASKS_BEGIN 
			+ SQL_SELECT_TASKS_MIDDLE_TOMORROW
			+ SQL_SELECT_TASKS_END;
	public static final String SQL_SELECT_TASKS_SOMEDAY = ""
			+ SQL_SELECT_TASKS_BEGIN 
			+ SQL_SELECT_TASKS_MIDDLE_SOMEDAY
			+ SQL_SELECT_TASKS_END;
	public static final String SQL_SELECT_TASKS_FIXED = ""
			+ SQL_SELECT_TASKS_BEGIN 
			+ SQL_SELECT_TASKS_MIDDLE_FIXED
			+ SQL_SELECT_TASKS_END;
	public static final String SQL_SELECT_TASKS_MOVED_TO_RECYCLE_BIN = ""
			+ SQL_SELECT_TASKS_BEGIN 
			+ SQL_SELECT_TASKS_MIDDLE_MOVED_TO_RECYCLE_BIN
			+ SQL_SELECT_TASKS_END;
	public static final String SQL_INSERT_TASK = ""
			+ "INSERT "
			+ "INTO tasks(userId,taskDesc,taskDate,taskStatId) "
			+ "VALUES (?,?,?,1)";
	private static final String SQL_UPDATE_TASK_STATUS_ID_BEGIN = ""
			+ "UPDATE tasks SET taskStatId = ";
	private static final String SQL_UPDATE_TASK_STATUS_ID_END = ""
			+ " WHERE taskId = ?";
	public static final String SQL_UPDATE_TASK_STATUS_TO_ACTIVE = ""
			+ SQL_UPDATE_TASK_STATUS_ID_BEGIN
			+ ID_NUM_TASK_STATUS_ACTIVE
			+ SQL_UPDATE_TASK_STATUS_ID_END;
	public static final String SQL_UPDATE_TASK_STATUS_TO_FIXED = ""
			+ SQL_UPDATE_TASK_STATUS_ID_BEGIN
			+ ID_NUM_TASK_STATUS_FIXED
			+ SQL_UPDATE_TASK_STATUS_ID_END;
	public static final String SQL_UPDATE_TASK_STATUS_TO_MOVED_TO_RECYCLE_BIN = ""
			+ SQL_UPDATE_TASK_STATUS_ID_BEGIN
			+ ID_NUM_TASK_STATUS_MOVED_TO_RECYCLE_BIN
			+ SQL_UPDATE_TASK_STATUS_ID_END;
	public static final String SQL_SELECT_TASK_BY_ID = ""
			+ "SELECT * "
			+ "FROM tasks "
			+ "LEFT JOIN taskFiles "
			+ "ON tasks.taskId = taskFiles.taskId "
			+ "WHERE tasks.taskId = ? ";
	public static final String SQL_DELETE_TASK_BY_ID = ""
			+ "DELETE "
			+ "FROM tasks "
			+ "WHERE taskId = ?";
	public static final String SQL_INSERT_TASK_FILE = ""
			+ "INSERT "
			+ "INTO taskFiles(taskId,fileName) "
			+ "VALUES (?,?)";
	public static final String SQL_SELECT_TASK_FILE = ""
			+ "SELECT * "
			+ "FROM taskFiles "
			+ "WHERE taskId = ?";
	public static final String SQL_DELETE_TASK_FILE = ""
			+ "DELETE "
			+ "FROM taskFiles "
			+ "WHERE taskId = ?";
}
