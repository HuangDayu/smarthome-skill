# 智能家居技能SDK

国内语音交互平台智能家居技能SDK  

# 支持的平台  

- [百度DuerOS](https://dueros.baidu.com)
- [天猫AliGenie](https://open.bot.tmall.com)
- [小米IOT](https://iot.mi.com)
- [若琪Rokid](https://developer.rokid.com)
- [出门问问Mobvoi](https://ai.chumenwenwen.com/)
- [猎豹Orion](https://voiceos.ainirobot.com/) 
- [京东JDAlpha](http://alphadev.jd.com/skill)  
- [思必驰DUI](https://www.dui.ai/)  

# 使用方法

## 添加依赖

```xml
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>
```

```xml
<dependency>
	<groupId>com.github.huangdayu</groupId>
	<artifactId>skill</artifactId>
	<version>master-SNAPSHOT</version>
</dependency>
```

## 实现接口

实现`org.smarthome.skill.service.SmartHomeSkillService`接口    

```java
import java.util.List;
import org.smarthome.skill.dto.ResultDTO;
import org.smarthome.skill.entity.DeviceEntity;
import org.smarthome.skill.service.SmartHomeSkillService;
public class SmartHomeSkillServiceImpl implements SmartHomeSkillService {
	/**
	 * 发现设备
	 * @param accessToken OAuth2.0  AccessToken
	 * @param openUid 对外开放的OpenUid 可以为空
	 * @return 设备列表
	 */
	@Override
	public List<DeviceEntity> discoveryDevice(String token,String openUid) {
		System.out.println(token);
		return null;
	}
	/**
	 * 控制设备
	 * @param accessToken OAuth2.0  AccessToken
	 * @param openUid 对外开放的OpenUid 可以为空
	 * @param order 标准指令
	 * @param deviceID 设备ID 
	 * @param devicePlace 设备位置（可以为空）
	 * @param value 设备属性值（可以为空）
	 * @return 执行结果
	 */
	@Override
	public ResultDTO<Object> controlDevice(String accessToken, String openUid, String order, String deviceID,
			String devicePlace, Object value) {
		return null;
	}
	
	/**
	 * 查询设备状态和属性信息
	 * @param accessToken OAuth2.0  AccessToken
	 * @param openUid 对外开放的OpenUid 可以为空
	 * @param order 指令
	 * @param deviceID 设备ID
	 * @return 查询结果
	 */
	@Override
	public ResultDTO<Object> queryDevice(String token,String openUid, String order, String deviceID) {
		return null;
	}
}
```

调用`org.smarthome.skill.service.SmartHomeSkill.skillOperation()`方法    

```java
	/**
	 * 
	 * @param smartHomeSkillService 接口的实现对象
	 * @param spEnum 平台类型
	 * @param json 使用序列化后的josn字符串作为参数
	 * @return 响应的json对象
	 */
	public static Object skillOperation(SmartHomeSkillService smartHomeSkillService, SkillPlatformEnum spEnum,
			String json) {
		return skillOperation(spEnum, json, smartHomeSkillService);
	}
```

## 调用处理结果

类直接调用    

```java
	@ResponseBody
	@RequestMapping(value = "/skillOperation", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	public Object skillOperation(HttpServletRequest request){
		return SmartHomeSkill.skillOperation(new SmartHomeSkillServiceImpl(),SkillPlatformEnum.BAIDU_DUEROS,request);
	}
```
