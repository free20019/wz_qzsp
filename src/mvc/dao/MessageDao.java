//package mvc.dao;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import mvc.entity.Cljcxx;
//
//import org.apache.ibatis.session.SqlSession;
//
//import db.DBAccess;
//
//public class MessageDao {
//	public List<Cljcxx> queryMessageList(String com,String description){
//		List<Cljcxx> messageList =new ArrayList<Cljcxx>();
//		DBAccess dbAccess=new DBAccess();
//		SqlSession sqlSession=null;
//		try {
//			sqlSession=dbAccess.getSqlSession();
//			//通过sqlSession执行Sql语句
//			messageList=sqlSession.selectList("Message.queryMessageList");
//			
//		} catch (IOException e) {
//			logger.error("app_error",e);
//		} finally{
//			if(sqlSession !=null){
//				sqlSession.close();
//			}
//		}
//		return messageList;
//	}
//	
//	public List<Cljcxx> deleteMessageList(String com,String description){
//		List<Cljcxx> messageList =new ArrayList<Cljcxx>();
//		DBAccess dbAccess=new DBAccess();
//		SqlSession sqlSession=null;
//		try {
//			sqlSession=dbAccess.getSqlSession();
//			//通过sqlSession执行Sql语句
//			messageList=sqlSession.selectList("Message.deleteMessageList");
//		} catch (IOException e) {
//			logger.error("app_error",e);
//		} finally{
//			if(sqlSession !=null){
//				sqlSession.close();
//			}
//		}
//		return messageList;
//	}
//	
//	public int insertMessageList(String com,String description){
////		List<Cljcxx> messageList =new ArrayList<Cljcxx>();
//		int count = 0;
//		DBAccess dbAccess=new DBAccess();
//		SqlSession sqlSession=null;
//		try {
//			sqlSession=dbAccess.getSqlSession();
//			//通过sqlSession执行Sql语句
//			count=sqlSession.insert("Message.insertMessageList");
//		} catch (IOException e) {
//			logger.error("app_error",e);
//		} finally{
//			if(sqlSession !=null){
//				sqlSession.close();
//			}
//		}
//		return count;
//	}
//	
//	public List<Cljcxx> updateMessageList(String com,String description){
//		List<Cljcxx> messageList =new ArrayList<Cljcxx>();
//		DBAccess dbAccess=new DBAccess();
//		SqlSession sqlSession=null;
//		try {
//			sqlSession=dbAccess.getSqlSession();
//			//通过sqlSession执行Sql语句
//			messageList=sqlSession.selectList("Message.updateMessageList");
//		} catch (IOException e) {
//			logger.error("app_error",e);
//		} finally{
//			if(sqlSession !=null){
//				sqlSession.close();
//			}
//		}
//		return messageList;
//	}
//	
//	public static void main(String[] args) {
//		MessageDao messageDao=new MessageDao();
//		List<Cljcxx> messageList =new ArrayList<Cljcxx>();
////		messageDao.deleteMessageList("1", "1");
//		int count=messageDao.insertMessageList("1", "1");
////		messageDao.updateMessageList("1", "1");
//		logger.info(count);
////		List<Cljcxx> app=messageDao.queryMessageList("1", "1");
////		for (int i = 0; i < app.size(); i++) {
////			logger.info(app.get(i).getId().toString());
////			logger.info(app.get(i).getCphm().toString());
////			logger.info(app.get(i).getClbh().toString());
////		}
//	}
//}
