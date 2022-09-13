package groupId.artifactId.storage.api;

import groupId.artifactId.storage.VoteResults;

public interface IVotesStorage extends IEssenceStorage<VoteResults>{
    void save(VoteResults voteResults);
}
