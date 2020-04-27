package com.bullhornsdk.data.model.entity.core.certificationrequirement;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Objects;

/**
 * Created by mkesmetzis 27-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "candidateCertification", "certification", "certificationFileAttachments",
    "customDate1", "customDate10", "customDate2", "customDate3", "customDate4", "customDate5", "customDate6",
    "customDate7", "customDate8", "customDate9", "customFloat1", "customFloat2", "customFloat3", "customInt1",
    "customInt2", "customInt3", "customText1", "customText10", "customText2", "customText3",
    "customText4", "customText5", "customText6", "customText7", "customText8", "customText9", "customTextBlock1",
    "customTextBlock10", "customTextBlock2", "customTextBlock3", "customTextBlock4", "customTextBlock5", "customTextBlock6",
    "customTextBlock7", "customTextBlock8", "customTextBlock9", "dateAdded", "dateExpiration", "documentDeadline",
    "fileAttachments", "jobSubmission", "matchingCredentialCount", "modifyingUser", "owner", "status", "userCertificationName",
    "userCertificationStatus"})
public class JobSubmissionCertificationRequirement extends AbstractRequirement implements UpdateEntity, CreateEntity, QueryEntity,
    AssociationEntity, EditHistoryEntity {

    private JobSubmission jobSubmission;

    public JobSubmissionCertificationRequirement() {
    }

    public JobSubmissionCertificationRequirement(Integer id) {
        super(id);
    }



    @JsonProperty("jobSubmission")
    public JobSubmission getJobSubmission() {
        return jobSubmission;
    }

    @JsonProperty("jobSubmission")
    public void setJobSubmission(JobSubmission jobSubmission) {
        this.jobSubmission = jobSubmission;
    }

    @Override
    public String toString() {
        return "JobSubmissionCertificationRequirement{" +
            "jobSubmission=" + jobSubmission +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        JobSubmissionCertificationRequirement that = (JobSubmissionCertificationRequirement) o;
        return Objects.equals(jobSubmission, that.jobSubmission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), jobSubmission);
    }

}
