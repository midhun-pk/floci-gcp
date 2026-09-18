package io.floci.gcp.services.bigquery.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.quarkus.runtime.annotations.RegisterForReflection;

import java.util.Map;

@RegisterForReflection
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Table {

    private String kind = "bigquery#table";
    private String id;
    private String etag;
    private String selfLink;
    private TableReference tableReference;
    private String friendlyName;
    private String description;
    private String type = "TABLE";
    private TableSchema schema;
    private Map<String, String> labels;
    private String numRows;
    private String numBytes;
    private String creationTime;
    private String lastModifiedTime;
    /** {@code ViewDefinition}: {@code query}, {@code useLegacySql}. */
    private Map<String, Object> view;
    /** {@code MaterializedViewDefinition}: {@code query}. */
    private Map<String, Object> materializedView;

    public String getKind() { return kind; }
    public void setKind(String kind) { this.kind = kind; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getEtag() { return etag; }
    public void setEtag(String etag) { this.etag = etag; }

    public String getSelfLink() { return selfLink; }
    public void setSelfLink(String selfLink) { this.selfLink = selfLink; }

    public TableReference getTableReference() { return tableReference; }
    public void setTableReference(TableReference tableReference) { this.tableReference = tableReference; }

    public String getFriendlyName() { return friendlyName; }
    public void setFriendlyName(String friendlyName) { this.friendlyName = friendlyName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public TableSchema getSchema() { return schema; }
    public void setSchema(TableSchema schema) { this.schema = schema; }

    public Map<String, String> getLabels() { return labels; }
    public void setLabels(Map<String, String> labels) { this.labels = labels; }

    public String getNumRows() { return numRows; }
    public void setNumRows(String numRows) { this.numRows = numRows; }

    public String getNumBytes() { return numBytes; }
    public void setNumBytes(String numBytes) { this.numBytes = numBytes; }

    public String getCreationTime() { return creationTime; }
    public void setCreationTime(String creationTime) { this.creationTime = creationTime; }

    public String getLastModifiedTime() { return lastModifiedTime; }
    public void setLastModifiedTime(String lastModifiedTime) { this.lastModifiedTime = lastModifiedTime; }

    public Map<String, Object> getView() { return view; }
    public void setView(Map<String, Object> view) { this.view = view; }

    public Map<String, Object> getMaterializedView() { return materializedView; }
    public void setMaterializedView(Map<String, Object> materializedView) { this.materializedView = materializedView; }

    /** The GoogleSQL of a logical or materialized view, or null for other table types. */
    public String viewQuery() {
        Map<String, Object> definition = view != null ? view : materializedView;
        return definition != null && definition.get("query") instanceof String q ? q : null;
    }
}
