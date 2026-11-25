CREATE TABLE pages (
    "id" UUID PRIMARY KEY,
    "title" VARCHAR(255) NOT NULL,
    "slug" VARCHAR(255) NOT NULL,
    "description" VARCHAR,
    "status" VARCHAR(50) NOT NULL DEFAULT 'draft',
    "createdBy" UUID,
    "deletedAt" TIMESTAMP,
    "createdAt" TIMESTAMP DEFAULT NOW(),
    "updatedAt" TIMESTAMP DEFAULT NOW(),
    CONSTRAINT "fk_pages_createdBy" FOREIGN KEY ("createdBy") REFERENCES "user_contexts" ("id")
);
CREATE UNIQUE INDEX "idx_pages_slug" ON pages ("slug") WHERE "deletedAt" IS NULL;
CREATE INDEX "idx_pages_status" ON pages ("status");
