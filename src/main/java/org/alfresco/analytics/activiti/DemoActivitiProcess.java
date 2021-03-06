package org.alfresco.analytics.activiti;

import java.util.ArrayList;
import java.util.List;

import org.alfresco.service.cmr.repository.NodeRef;
import org.joda.time.DateTime;

/**
 * Pojo representation of basic activiti process demo data
 *
 * @author Gethin James
 */
public class DemoActivitiProcess
{
    public static enum TaskState
    {
        EARLY, ONTIME, LATE;
    }
    
    private String processId;
    private String definitionKey;
    private DateTime dueTime;
    private DateTime startTime;    
    private DateTime endTime;
    private String user;
    private int priority;
    private TaskState state;
    private List<NodeRef> contentNode = new ArrayList<NodeRef>();

    public DemoActivitiProcess(String processId, String definitionKey, DateTime startTime,
                DateTime endTime, DateTime dueTime,  String user, int priority, TaskState state, NodeRef content)
    {
        super();
        this.processId = processId;
        this.definitionKey = definitionKey;
        this.startTime = startTime;
        this.endTime = endTime;
        this.dueTime = dueTime;
        this.user = user;
        this.priority = priority;
        this.state = state;
        if (content!=null)
        {
            contentNode.add(content);            
        }
    }

    public String getProcessId()
    {
        return this.processId;
    }

    public String getDefinitionKey()
    {
        return this.definitionKey;
    }

    public DateTime getStartTime()
    {
        return this.startTime;
    }

    public DateTime getEndTime()
    {
        return this.endTime;
    }

    public String getUser()
    {
        return this.user;
    }

    public DateTime getDueTime()
    {
        return this.dueTime;
    }

    public void setProcessId(String processId)
    {
        this.processId = processId;
    }

    public List<NodeRef> getContentNodes()
    {
        return this.contentNode;
    }

    public int getPriority()
    {
        return this.priority;
    }

    public TaskState getState()
    {
        return this.state;
    }
    
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("DemoActivitiProcess [processId=").append(this.processId)
                    .append(", definitionKey=").append(this.definitionKey).append(", dueTime=")
                    .append(this.dueTime).append(", startTime=").append(this.startTime)
                    .append(", endTime=").append(this.endTime).append(", user=").append(this.user)
                    .append(", priority=").append(this.priority).append(", state=")
                    .append(this.state).append(", contentNode=").append(this.contentNode)
                    .append("]");
        return builder.toString();
    }



}
